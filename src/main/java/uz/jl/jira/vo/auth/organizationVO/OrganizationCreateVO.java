package uz.jl.jira.vo.auth.organizationVO;

import lombok.*;
import uz.jl.jira.domains.auth.Organization;
import uz.jl.jira.vo.BaseVO;

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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrganizationCreateVO implements BaseVO {
    private String name;
    private Long createdBy;

}
