package uz.jl.jira.vo.auth.commentVO;

import lombok.*;
import uz.jl.jira.vo.BaseVO;

/**
 * name : Abul_dev
 * data:   Thursday
 * project name : trelloAlfa
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentCreateVO implements BaseVO {
    private Long ownerId;
}
