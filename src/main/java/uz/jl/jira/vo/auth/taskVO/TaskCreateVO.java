package uz.jl.jira.vo.auth.taskVO;

import lombok.*;
import uz.jl.jira.vo.BaseVO;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:43   16/06/22
 * @Project :  trelloAlfa
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class TaskCreateVO implements BaseVO {
    private String name;
}
