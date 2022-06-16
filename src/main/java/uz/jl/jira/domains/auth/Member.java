package uz.jl.jira.domains.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private Long memberId;
    private Long userId;
    private Boolean isTeamLead;
}
