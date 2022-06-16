package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.criteria.CommentCriteria;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.CommentRepository;
import uz.jl.jira.repository.auth.UserRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.vo.auth.commentVO.CommentCreateVO;
import uz.jl.jira.vo.auth.commentVO.CommentUpdateVO;
import uz.jl.jira.vo.auth.commentVO.CommentVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ResponseEntity;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  16:25   16/06/22
 * @Project :  trelloAlfa
 */
public class CommentService extends AbstractRepository<CommentRepository, BaseMapper> implements GenericCRUDService<CommentVO, CommentCreateVO, CommentUpdateVO, CommentCriteria, Long> {

    private  static CommentService instance;


    protected CommentService(CommentRepository repository, BaseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<Long>> create(@NonNull CommentCreateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(@NonNull CommentUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<CommentVO>> findById(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<CommentVO>>> findAll(@NonNull CommentCriteria criteria) {
        return null;
    }

    public static CommentService getInstance() {
        if (instance == null) {
            instance = new CommentService(
                    ApplicationContextHolder.getBean(CommentRepository.class),
                    ApplicationContextHolder.getBean(BaseMapper.class)
            );
        }
        return instance;
    }
}
