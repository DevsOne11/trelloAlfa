package uz.jl.jira.vo.auth.memberVO;

import lombok.*;
import uz.jl.jira.vo.GenericVO;

import java.time.LocalDateTime;

/**
 * name : Abul_dev
 * data:   Thursday
 * project name : trelloAlfa
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberUpdateVO extends GenericVO {
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private boolean blocked;
    private boolean deleted;
}
