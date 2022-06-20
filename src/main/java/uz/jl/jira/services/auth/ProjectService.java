package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.criteria.UserCriteria;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.ProjectRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.vo.auth.projectVO.ProjectCreateVO;
import uz.jl.jira.vo.auth.projectVO.ProjectUpdateVO;
import uz.jl.jira.vo.auth.projectVO.ProjectVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ResponseEntity;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  16:24   16/06/22
 * @Project :  trelloAlfa
 */
public class ProjectService extends AbstractRepository<ProjectRepository, BaseMapper> implements GenericCRUDService<ProjectVO, ProjectCreateVO, ProjectUpdateVO, UserCriteria, Long> {

    private static ProjectService instance;


    private ProjectService(ProjectRepository repository, BaseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<Long>> create(@NonNull ProjectCreateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> update(@NonNull ProjectUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<ProjectVO>> findById(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<ProjectVO>>> findAll(@NonNull UserCriteria criteria) {
        return null;
    }

    public static ProjectService getInstance() {
        if (instance == null) {
            instance = new ProjectService(
                    ApplicationContextHolder.getBean(ProjectRepository.class),
                    ApplicationContextHolder.getBean(BaseMapper.class)
            );
        }
        return instance;
    }
}
