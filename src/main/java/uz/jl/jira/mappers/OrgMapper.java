package uz.jl.jira.mappers;

import uz.jl.jira.domains.auth.Organization;
import uz.jl.jira.vo.auth.organizationVO.OrganizationVO;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  09:24   20/06/22
 * @Project :  trelloAlfa
 */

public class OrgMapper implements BaseMapper {

    private static OrgMapper instance;

    public static Organization getOrganization(OrganizationVO orgVO){

        Organization organization = new Organization();
        organization.setId(orgVO.getId());
        organization.setName(orgVO.getName());
        organization.setProjects(orgVO.getProjects());
        organization.setCreatedBy(orgVO.getCreatedBy());
        organization.setCreatedAt(orgVO.getCreatedAt());
        organization.setMembers(orgVO.getMembers());

        return organization;
    }

    public static OrgMapper getInstance() {
        if (instance == null){
            instance = new OrgMapper();
        }
        return instance;
    }

    public OrganizationVO getOrgVO(Organization organization) {
        OrganizationVO orgVO = new OrganizationVO();
        /**
         * Long id;
         * String name;
         * Long ownerId;
         * List<Long> projects = new ArrayLi
         * List<Long> members = new ArrayLis
         * LocalDateTime createdAt;
         * Long createdBy;
         * LocalDateTime updatedAt;
         * Long updatedBy;
         * Boolean deleted = false;
         * Boolean blocked=  false;
         */
        orgVO.setId(organization.getId());
        orgVO.setName(organization.getName());
        orgVO.setProjects(organization.getProjects());
        orgVO.setMembers(organization.getMembers());
        orgVO.setCreatedAt(organization.getCreatedAt());
        orgVO.setUpdatedAt(organization.getUpdatedAt());
        orgVO.setUpdatedBy(organization.getUpdatedBy());
        orgVO.setDeleted(organization.getDeleted());
        orgVO.setBlocked(organization.getBlocked());
        return orgVO;
    }
}
