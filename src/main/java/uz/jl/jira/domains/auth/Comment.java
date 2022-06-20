package uz.jl.jira.domains.auth;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:24   16/06/22
 * @Project :  trelloBeta
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Comment extends Auditable {
    private Long id;
    private Long ownerId;
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private boolean blocked;
    private boolean deleted;
}
