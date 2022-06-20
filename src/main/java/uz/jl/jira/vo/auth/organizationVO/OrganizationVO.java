package uz.jl.jira.vo.auth.organizationVO;

import lombok.*;
import uz.jl.jira.domains.auth.Organization;
import uz.jl.jira.vo.GenericVO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * name : Abul_dev
 * data:   Thursday
 * project name : trelloAlfa
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class OrganizationVO extends GenericVO {
    private Long id;
    private String name;
    private Long ownerId;
    private List<Long> projects = new ArrayList<>();
    private Map<Long, String> members = new HashMap<>();
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private Boolean deleted  = false;
    private Boolean blocked = false;

    public OrganizationVO(Organization organization) {
        super(organization.getId());
        this.name = organization.getName();
        this.createdAt = organization.getCreatedAt();
        this.createdBy = organization.getCreatedBy();
    }

    public OrganizationVO(Long id, LocalDateTime createdAt, Long createdBy, Long id1, String name) {
        super(id);
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.id = id1;
        this.name = name;
    }
}
