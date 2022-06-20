package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.criteria.OrganizationCriteria;
import uz.jl.jira.domains.auth.Organization;
import uz.jl.jira.domains.enums.MemberStatus;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.mappers.OrgMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.OrganizationRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.ui.Session;
import uz.jl.jira.vo.auth.organizationVO.OrganizationCreateVO;
import uz.jl.jira.vo.auth.organizationVO.OrganizationUpdateVO;
import uz.jl.jira.vo.auth.organizationVO.OrganizationVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ErrorVO;
import uz.jl.jira.vo.response.ResponseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  16:21   16/06/22
 * @Project :  trelloAlfa
 */
public class OrganizationService extends AbstractRepository<OrganizationRepository,OrgMapper> implements
 GenericCRUDService<OrganizationVO, OrganizationCreateVO, OrganizationUpdateVO, OrganizationCriteria, Long> {

    private static OrganizationService instance;
    protected OrganizationService(OrganizationRepository repository, OrgMapper mapper) {
        super(repository, mapper);
    }

    private static MemberService memberService = ApplicationContextHolder.getBean(MemberService.class);
    private static UserService userService = ApplicationContextHolder.getBean(UserService.class);

    @Override
    public ResponseEntity<Data<Long>> create(@NonNull OrganizationCreateVO dto) {

        /**
         *
         * id;
         * g name;
         * ownerId;
         * Long> projects = new ArrayList<>();
         * Long> members = new ArrayList<>();
         * DateTime createdAt;
         * createdBy;
         * DateTime updatedAt;
         * updatedBy;
         * an deleted  = false;
         * an blocked = false;
         *
         */

        OrganizationVO orgVO = new OrganizationVO();
        Optional<Organization> orgOptional = repository.findByUsername(dto.getName());
        if (orgOptional.isPresent()) {
            return new ResponseEntity<>(new Data<>(ErrorVO
                    .builder()
                    .friendlyMessage("Organizationanization Name '%s' already taken".formatted(dto.getName()))
                    .status(400)
                    .build()));
        }

        orgVO.setId(System.currentTimeMillis());
        orgVO.setName(dto.getName());
        Map<Long, String> members = orgVO.getMembers();
        members.put(Session.userId, MemberStatus.ADMIN.name());
        orgVO.setMembers(members);
        orgVO.setCreatedAt(LocalDateTime.now());
        orgVO.setCreatedBy(dto.getCreatedBy());


//        MemberCreateVO createVO = MemberCreateVO.builder()
//                .id(Tools.getId(orgVO.getId()))
//                .organizationId(orgVO.getId())
//                .userId(orgVO.getOwnerId())
//                .status(MemberStatus.SUPER_USER)
//                .build();

//        memberService.create(createVO);
        repository.create(OrgMapper.getOrganization(orgVO));
//        userService.addOrganizationToUser(Session.userId, orgVO.getId());

        return new ResponseEntity<>(new Data<>(orgVO.getId()));

    }

    @Override
    public ResponseEntity<Data<String>> delete(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> update(@NonNull OrganizationUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<OrganizationVO>> findById(@NonNull Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<OrganizationVO>>> findAll(@NonNull OrganizationCriteria criteria) {
        List<OrganizationVO> orgList = new ArrayList<>();

        for (Organization organization : repository.findAll(new OrganizationCriteria()).get()) {
            orgList.add(mapper.getOrgVO(organization));
        }

        return new ResponseEntity<>(new Data<>(orgList, orgList.size()));
    }

    public ResponseEntity<Data<List<OrganizationVO>>> findAllByIds(List<Long> ids) {

        List<OrganizationVO> orgVOS = new ArrayList<>();

        for (OrganizationVO orgVO : findAll(new OrganizationCriteria()).getData().getBody()) {
            if(ids.contains(orgVO.getId())){
                orgVOS.add(orgVO);
            }
        }

        return new ResponseEntity<>(new Data<>(orgVOS, orgVOS.size()));
    }

    public static OrganizationService getInstance() {
        if (instance == null) {
            instance = new OrganizationService(
                    ApplicationContextHolder.getBean(OrganizationRepository.class),
                    ApplicationContextHolder.getBean(OrgMapper.class)
            );
        }
        return instance;
    }

    public ResponseEntity<Data<String>> addProjectToOrganization(Long projectId, Long orgId) {
        for (Organization organization : repository.findAll(new OrganizationCriteria()).get()) {
            if (organization.getId()==orgId){
                List<Long> projects = organization.getProjects();
                projects.add(projectId);
                organization.setProjects(projects);
                repository.update(organization);
                return new ResponseEntity<>(new Data<>("organization added"));
            }
        }
        return new ResponseEntity<>(new Data<>(new ErrorVO("Organization not found", "Organization not found", 400)));

    }
}