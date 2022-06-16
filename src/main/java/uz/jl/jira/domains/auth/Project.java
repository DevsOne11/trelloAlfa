package uz.jl.jira.domains.auth;

import lombok.*;
import uz.jl.jira.domains.BaseEntity;

import java.util.Date;
import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:40   16/06/22
 * @Project :  trelloBeta
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project extends Auditable {
    private Long id;
    private String name;
    private List<ProjectColumn> columnList;
    private List<Member> memberList;
    private Date deadline;
}
