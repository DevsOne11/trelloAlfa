package uz.jl.jira.domains.auth;

import lombok.*;
import uz.jl.jira.domains.enums.TaskStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
@ToString
public class Task extends Auditable{
    private Long id;
    private String name;
    private List<Long> comments = new ArrayList<>();
    private List<Long> members = new ArrayList<>();
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private TaskStatus status;
    private boolean deleted;
}
