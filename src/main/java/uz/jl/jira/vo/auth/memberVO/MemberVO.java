package uz.jl.jira.vo.auth.memberVO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.jira.domains.enums.MemberStatus;
import uz.jl.jira.vo.GenericVO;

/**
 * name : Abul_dev
 * data:   Thursday
 * project name : trelloAlfa
 */
@Getter
@Setter
@NoArgsConstructor

public class MemberVO extends GenericVO {

    private Long id;
    private Long userId;
    private Long organizationId;
    private Long projectId;
    private MemberStatus status;
    private boolean blocked;
    private boolean deleted;

}
