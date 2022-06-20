package uz.jl.jira.domains.auth;

import lombok.*;
import uz.jl.jira.domains.enums.Role;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
@ToString
public class User extends Auditable {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private List<Long> organizations = new ArrayList<>();
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void addOrganization(Long orgId) {
        organizations.add(orgId);
    }

}
