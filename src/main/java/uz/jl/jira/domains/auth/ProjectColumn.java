package uz.jl.jira.domains.auth;

import uz.jl.jira.domains.BaseEntity;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:37   16/06/22
 * @Project :  trelloBeta
 */
public class ProjectColumn extends Auditable {
    private Long id;
    private String name;
    private List<Task> taskList;
}
