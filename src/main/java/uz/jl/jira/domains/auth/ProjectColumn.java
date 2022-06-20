package uz.jl.jira.domains.auth;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:37   16/06/22
 * @Project :  trelloBeta
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class ProjectColumn extends Auditable {
    private Long id;
    private String name;
    private List<Long> tasks =new ArrayList<>();
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private boolean blocked;
    private boolean deleted;
}
