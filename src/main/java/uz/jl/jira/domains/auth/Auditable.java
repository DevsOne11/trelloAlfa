package uz.jl.jira.domains.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.jira.domains.BaseEntity;

import java.time.LocalDateTime;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:25   16/06/22
 * @Project :  trelloBeta
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Auditable implements BaseEntity {
    private LocalDateTime createdAt;
    private User createdBy;
    private LocalDateTime updatedAt;
    private User updatedBy;
    private Boolean isBlocked;
    private Boolean isDeleted;
}
