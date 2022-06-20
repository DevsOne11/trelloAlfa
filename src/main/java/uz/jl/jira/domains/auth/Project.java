package uz.jl.jira.domains.auth;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
@ToString
public class Project extends Auditable {
    private Long id;
    private String name;
    private List<Long> columns = new ArrayList<>();
    private List<Long> members = new ArrayList<>();
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private LocalDateTime deadline;
    private boolean blocked = false;
    private boolean deleted = false;
}
