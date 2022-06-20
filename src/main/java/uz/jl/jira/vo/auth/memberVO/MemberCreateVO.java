package uz.jl.jira.vo.auth.memberVO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.jl.jira.domains.enums.MemberStatus;
import uz.jl.jira.vo.BaseVO;

/**
 * name : Abul_dev
 * data:   Thursday
 * project name : trelloAlfa
 */
@Getter
@Setter
@Builder
public class MemberCreateVO implements BaseVO {
    private Long id;
    private Long userId;
    private Long organizationId;
    private Long projectId;
    private MemberStatus status;
}
