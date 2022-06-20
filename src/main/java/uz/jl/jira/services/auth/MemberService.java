package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.criteria.MemberCriteria;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.MemberRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.vo.auth.memberVO.MemberCreateVO;
import uz.jl.jira.vo.auth.memberVO.MemberUpdateVO;
import uz.jl.jira.vo.auth.memberVO.MemberVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ResponseEntity;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  16:25   16/06/22
 * @Project :  trelloAlfa
 */
public class MemberService extends AbstractRepository<MemberRepository, BaseMapper>
        implements GenericCRUDService<MemberVO, MemberCreateVO, MemberUpdateVO, MemberCriteria, Long> {

    private static MemberService instance;

    protected MemberService(MemberRepository repository, BaseMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public ResponseEntity<Data<Long>> create(@NonNull MemberCreateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> update(@NonNull MemberUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<MemberVO>> findById(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<MemberVO>>> findAll(@NonNull MemberCriteria criteria) {
        return null;
    }

    public static MemberService getInstance() {
        if (instance == null){
            instance = new MemberService(
                    ApplicationContextHolder.getBean(MemberRepository.class),
                    ApplicationContextHolder.getBean(BaseMapper.class)
            );
        }
        return instance;
    }

}
