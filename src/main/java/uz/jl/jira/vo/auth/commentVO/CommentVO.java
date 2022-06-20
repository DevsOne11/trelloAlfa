package uz.jl.jira.vo.auth.commentVO;

import lombok.Builder;
import uz.jl.jira.domains.auth.Comment;
import uz.jl.jira.vo.GenericVO;

import java.time.LocalDateTime;

/**
 * name : Abul_dev
 * data:   Thursday
 * project name : trelloAlfa
 */
public class CommentVO extends GenericVO {
    private LocalDateTime createdAt;
    private Long createdBy;

    public CommentVO(Long id, LocalDateTime createdAt, Long createdBy) {
        super(id);
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    @Builder(builderMethodName = "childBuilder")
    public CommentVO(LocalDateTime createdAt, Long createdBy) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public CommentVO(Comment comment) {

    }
}
