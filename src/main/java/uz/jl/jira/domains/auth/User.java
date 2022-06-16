package uz.jl.jira.domains.auth;

import lombok.*;
import uz.jl.jira.domains.BaseEntity;
import uz.jl.jira.domains.enums.Role;

import java.time.LocalDateTime;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/15:03 (Tuesday)
 * jira/IntelliJ IDEA
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends Auditable {
    private Long id;
    private String userName;
    private String password;
    private Role role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
