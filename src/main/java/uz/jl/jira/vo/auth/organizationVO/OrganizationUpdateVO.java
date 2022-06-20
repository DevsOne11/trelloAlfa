package uz.jl.jira.vo.auth.organizationVO;

import lombok.*;
import uz.jl.jira.domains.auth.Project;
import uz.jl.jira.vo.GenericVO;

import java.time.LocalDateTime;
import java.util.List;

/**
 * name : Abul_dev
 * data:   Thursday
 * project name : trelloAlfa
 */



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrganizationUpdateVO extends GenericVO {
    private String name;
    private List<Project> projectList;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private Boolean deleted;
    private Boolean blocked;
}
