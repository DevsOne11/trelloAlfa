package uz.jl.jira.repository.auth;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.jira.criteria.ProjectCriteria;
import uz.jl.jira.domains.auth.Project;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:13   16/06/22
 * @Project :  trelloAlfa
 */


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProjectRepository implements GenericCRUDRepository<Project, ProjectCriteria,Long> {


    private static ProjectRepository instance;
    private static final List<Project> projects = load();

    private static List<Project> load() {
        // TODO: 6/15/2022 load data from file here

        return new ArrayList<>();
    }
    @Override
    public void create(Project entity) {
        projects.add(entity);
    }

    @Override
    public void update(Project entity) {
        projects.add(entity);
    }

    @Override
    public void deleteByID(Long id) {
        for (Project project : projects) {
            if(project.getId().equals(id)){
                projects.remove(project);
                break;
            }
        }
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream()
                .filter(project -> project.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<List<Project>> findAll(ProjectCriteria criteria) {
        return Optional.of(projects);
    }

    public static ProjectRepository getInstance() {
        if (instance == null) {
            instance = new ProjectRepository();
        }
        return instance;
    }

    public Optional<Project> findByUsername(String name) {
        return projects.stream()
                .filter(project -> project.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
