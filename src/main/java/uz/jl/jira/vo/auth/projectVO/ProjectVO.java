package uz.jl.jira.vo.auth.projectVO;

import lombok.*;
import uz.jl.jira.domains.auth.Project;
import uz.jl.jira.vo.GenericVO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:44   16/06/22
 * @Project :  trelloAlfa
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjectVO extends GenericVO {
    private Long id;
    private String name;
    private List<Long> columns = new ArrayList<>();
    private List<Long> members = new ArrayList<>();
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private LocalDateTime deadline;
    private boolean blocked;
    private boolean deleted;

    public ProjectVO(Project project) {
        super(project.getId());
        this.name = project.getName();
        this.createdAt = project.getCreatedAt();
        this.createdBy = project.getCreatedBy();
    }

    @Builder(builderMethodName = "childBuilder")
    public ProjectVO(Long id, String name, LocalDateTime createdAt, Long createdBy) {
        super(id);
        this.name = name;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }
}
