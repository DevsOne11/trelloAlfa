package uz.jl.jira.domains.auth;

import lombok.*;
import uz.jl.jira.domains.BaseEntity;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:32   16/06/22
 * @Project :  trelloBeta
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task extends Auditable{
    private Long id;
    private String name;
    private List<Comment> commentList;
    private List<Member> memberList;
}
