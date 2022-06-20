package uz.jl.jira.repository.auth;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.jira.criteria.CommentCriteria;
import uz.jl.jira.domains.auth.Comment;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:27   16/06/22
 * @Project :  trelloAlfa
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CommentRepository implements GenericCRUDRepository<Comment, CommentCriteria, Long> {

    private static CommentRepository instance;
    private static final List<Comment> comments = load();

    private static List<Comment> load() {
        return new ArrayList<>();
    }

    @Override
    public void create(Comment entity) {
        entity.setId(System.currentTimeMillis());
        entity.setCreatedAt(LocalDateTime.now());
        comments.add(entity);
    }

    @Override
    public void update(Comment entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<Comment> findById(Long id) {
        return comments.stream()
                .filter(comment -> comment.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<List<Comment>> findAll(CommentCriteria criteria) {
//        return Optional.of(comments);
        return null;
    }

    public static CommentRepository getInstance(){
        if (instance == null){
            instance= new CommentRepository();
        }
        return instance;
    }
}
