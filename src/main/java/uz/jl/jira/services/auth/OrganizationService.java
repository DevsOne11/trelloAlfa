package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.criteria.OrganizationCriteria;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.OrganizationRepository;
import uz.jl.jira.repository.auth.UserRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.vo.auth.organizationVO.OrganizationCreateVO;
import uz.jl.jira.vo.auth.organizationVO.OrganizationUpdateVO;
import uz.jl.jira.vo.auth.organizationVO.OrganizationVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ResponseEntity;

import javax.management.OperationsException;
import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  16:21   16/06/22
 * @Project :  trelloAlfa
 */
public class OrganizationService extends AbstractRepository<OrganizationRepository,BaseMapper> implements
 GenericCRUDService<OrganizationVO, OrganizationCreateVO, OrganizationUpdateVO, OrganizationCriteria, Long> {

    private static OrganizationService instance;

    protected OrganizationService(OrganizationRepository repository, BaseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<Long>> create(@NonNull OrganizationCreateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(@NonNull OrganizationUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<OrganizationVO>> findById(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<OrganizationVO>>> findAll(@NonNull OrganizationCriteria criteria) {
        return null;
    }

    public static OrganizationService getInstance() {
        if (instance == null) {
            instance = new OrganizationService(
                    ApplicationContextHolder.getBean(OrganizationRepository.class),
                    ApplicationContextHolder.getBean(BaseMapper.class)
            );
        }
        return instance;
    }
}