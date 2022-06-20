package uz.jl.jira.vo.auth.taskVO;

import lombok.*;
import uz.jl.jira.domains.auth.Comment;
import uz.jl.jira.domains.auth.Member;
import uz.jl.jira.domains.enums.TaskStatus;
import uz.jl.jira.vo.GenericVO;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:43   16/06/22
 * @Project :  trelloAlfa
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class TaskUpdateVO  extends GenericVO {
    private String name;
    private List<Comment> comments;
    private List<Member> members;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private TaskStatus status;
    private boolean deleted;
}

