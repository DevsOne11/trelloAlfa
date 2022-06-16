package uz.jl.jira.repository.auth;

import uz.jl.jira.criteria.CommentCriteria;
import uz.jl.jira.domains.auth.Comment;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:27   16/06/22
 * @Project :  trelloAlfa
 */
public class CommentRepository implements GenericCRUDRepository<Comment, CommentCriteria, Long> {
    @Override
    public void create(Comment entity) {

    }

    @Override
    public void update(Comment entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<Comment> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Comment>> findAll(CommentCriteria criteria) {
        return Optional.empty();
    }
}
