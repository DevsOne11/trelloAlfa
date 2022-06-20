package uz.jl.jira.vo.auth.taskVO;

import lombok.*;
import uz.jl.jira.domains.auth.Task;
import uz.jl.jira.vo.GenericVO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:44   16/06/22
 * @Project :  trelloAlfa
 */


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskVO extends GenericVO {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;

    public TaskVO(Task task) {
        super(task.getId());
        this.name = task.getName();
        this.createdAt = task.getCreatedAt();
        this.createdBy = task.getCreatedBy();
    }

    @Builder(builderMethodName = "childBuilder")
    public TaskVO(Long id, String name, LocalDateTime createdAt, Long createdBy) {
        super(id);
        this.name = name;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }
}
