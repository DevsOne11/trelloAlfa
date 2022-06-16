package uz.jl.jira.domains.auth;

import lombok.*;
import uz.jl.jira.domains.BaseEntity;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:23   16/06/22
 * @Project :  trelloBeta
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member extends User {
    private Long memberId;
    private Boolean isTeamLead;
}
