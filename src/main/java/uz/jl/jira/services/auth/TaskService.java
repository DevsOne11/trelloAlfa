package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.criteria.TaskCriteria;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.TaskRepository;
import uz.jl.jira.repository.auth.UserRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.vo.auth.taskVO.TaskCreateVO;
import uz.jl.jira.vo.auth.taskVO.TaskUpdateVO;
import uz.jl.jira.vo.auth.taskVO.TaskVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ResponseEntity;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  16:24   16/06/22
 * @Project :  trelloAlfa
 */
public class TaskService extends AbstractRepository<TaskRepository, BaseMapper>
        implements GenericCRUDService<TaskVO, TaskCreateVO, TaskUpdateVO, TaskCriteria, Long> {

    private static TaskService instance;

    protected TaskService(TaskRepository repository, BaseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<Long>> create(@NonNull TaskCreateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(@NonNull TaskUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<TaskVO>> findById(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<TaskVO>>> findAll(@NonNull TaskCriteria criteria) {
        return null;
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
