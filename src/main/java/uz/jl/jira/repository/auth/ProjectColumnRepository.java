package uz.jl.jira.repository.auth;

import uz.jl.jira.criteria.ProjectColumnCriteria;
import uz.jl.jira.domains.auth.ProjectColumn;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:16   16/06/22
 * @Project :  trelloAlfa
 */
public class ProjectColumnRepository implements GenericCRUDRepository<ProjectColumn, ProjectColumnCriteria,Long> {

    private static ProjectColumnRepository instance;
    private static final List<ProjectColumn> columns = load();
    @Override
    public void create(ProjectColumn entity) {
        entity.setId(System.currentTimeMillis());
        entity.setCreatedAt(LocalDateTime.now());
        columns.add(entity);

    }

    @Override
    public void update(ProjectColumn entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<ProjectColumn> findById(Long id) {
        return columns.stream()
                .filter(column -> column.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<List<ProjectColumn>> findAll(ProjectColumnCriteria criteria) {
        return Optional.of(columns);
    }
    public static ProjectColumnRepository getInstance() {
        if (instance == null) {
            instance = new ProjectColumnRepository();
        }
        return instance;
    }
    private static List<ProjectColumn> load() {
        return new ArrayList<>();
    }

}
