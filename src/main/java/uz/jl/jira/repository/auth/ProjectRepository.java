package uz.jl.jira.repository.auth;

import uz.jl.jira.criteria.ProjectCriteria;
import uz.jl.jira.domains.auth.Project;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:13   16/06/22
 * @Project :  trelloAlfa
 */
public class ProjectRepository implements GenericCRUDRepository<Project, ProjectCriteria,Long> {


    private static ProjectRepository instance;
    @Override
    public void create(Project entity) {

    }

    @Override
    public void update(Project entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<Project> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Project>> findAll(ProjectCriteria criteria) {
        return Optional.empty();
    }
    public static ProjectRepository getInstance() {
        if (instance == null) {
            instance = new ProjectRepository();
        }
        return instance;
    }
}
