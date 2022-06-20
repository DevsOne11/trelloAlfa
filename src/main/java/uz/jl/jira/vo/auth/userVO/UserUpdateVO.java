package uz.jl.jira.vo.auth.userVO;

import lombok.*;
import uz.jl.jira.vo.GenericVO;

import java.time.LocalDateTime;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/15:41 (Tuesday)
 * jira/IntelliJ IDEA
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserUpdateVO extends GenericVO {
    private String userName;
    private String password;
    private LocalDateTime updatedAt;
}
