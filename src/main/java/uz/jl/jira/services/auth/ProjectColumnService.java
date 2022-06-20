package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.criteria.ProjectColumnCriteria;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.ProjectRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.vo.auth.projectColumnVO.ProjectColumnCreateVO;
import uz.jl.jira.vo.auth.projectColumnVO.ProjectColumnUpdateVO;
import uz.jl.jira.vo.auth.projectColumnVO.ProjectColumnVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ResponseEntity;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  16:24   16/06/22
 * @Project :  trelloAlfa
 */
public class ProjectColumnService extends AbstractRepository<ProjectRepository, BaseMapper>
        implements GenericCRUDService<ProjectColumnVO, ProjectColumnCreateVO, ProjectColumnUpdateVO, ProjectColumnCriteria,Long> {

    private static ProjectColumnService instance;

    protected ProjectColumnService(ProjectRepository repository, BaseMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public ResponseEntity<Data<Long>> create(@NonNull ProjectColumnCreateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> update(@NonNull ProjectColumnUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<ProjectColumnVO>> findById(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<ProjectColumnVO>>> findAll(@NonNull ProjectColumnCriteria criteria) {
        return null;
    }

    public static ProjectColumnService getInstance() {
        if (instance == null){
            instance = new ProjectColumnService(
                    ApplicationContextHolder.getBean(ProjectRepository.class),
                    ApplicationContextHolder.getBean(BaseMapper.class)
            );
        }
        return instance;
    }

}
