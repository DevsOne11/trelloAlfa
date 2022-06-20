package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.criteria.TaskCriteria;
import uz.jl.jira.domains.auth.Task;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.mappers.TaskMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.TaskRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.vo.auth.taskVO.TaskCreateVO;
import uz.jl.jira.vo.auth.taskVO.TaskUpdateVO;
import uz.jl.jira.vo.auth.taskVO.TaskVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ErrorVO;
import uz.jl.jira.vo.response.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  16:24   16/06/22
 * @Project :  trelloAlfa
 */
public class TaskService extends AbstractRepository<TaskRepository, BaseMapper> implements
        GenericCRUDService<TaskVO, TaskCreateVO, TaskUpdateVO, TaskCriteria, Long> {

    private static TaskService instance;

    protected TaskService(TaskRepository repository, BaseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<Long>> create(@NonNull TaskCreateVO dto) {
        Optional<Task> taskOptional = repository.findByUsername(dto.getName());
        if (taskOptional.isPresent()) {
            return new ResponseEntity<>(new Data<>(ErrorVO
                    .builder()
                    .friendlyMessage("Task name '%s' already taken".formatted(dto.getName()))
                    .status(400)
                    .build()));
        }
        TaskVO taskVO = new TaskVO();
        taskVO.setName(dto.getName());

        repository.create(TaskMapper.getTask(taskVO));

        return new ResponseEntity<>(new Data<>(taskVO.getId()));
    }

    @Override
    public ResponseEntity<Data<String>> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> update(@NonNull TaskUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<TaskVO>> findById(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<TaskVO>>> findAll(@NonNull TaskCriteria criteria) {
        List<TaskVO> taskList = repository.findAll(criteria)
                .orElse(new ArrayList<>())
                .stream().map(TaskVO::new)
                .toList();

        return new ResponseEntity<>(new Data<>(taskList, taskList.size()));
    }

    public static TaskService getInstance() {
        if (instance == null) {
            instance = new TaskService(
                    ApplicationContextHolder.getBean(TaskRepository.class),
                    ApplicationContextHolder.getBean(BaseMapper.class)
            );
        }
        return instance;
    }
}
