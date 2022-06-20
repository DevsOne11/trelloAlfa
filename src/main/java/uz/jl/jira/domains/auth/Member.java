package uz.jl.jira.domains.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.jira.domains.enums.MemberStatus;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:23   16/06/22
 * @Project :  trelloBeta
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member extends Auditable {
    private Long id;
    private Long userId;
    private Long organizationId;
    private Long projectId;
    private MemberStatus status;
    private boolean blocked;
    private boolean deleted;
}
