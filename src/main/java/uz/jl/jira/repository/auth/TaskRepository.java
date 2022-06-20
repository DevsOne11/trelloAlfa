package uz.jl.jira.repository.auth;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.jira.criteria.TaskCriteria;
import uz.jl.jira.domains.auth.Task;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:24   16/06/22
 * @Project :  trelloAlfa
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TaskRepository implements GenericCRUDRepository<Task, TaskCriteria, Long> {

    private static TaskRepository instance;

    private static final List<Task> tasks = load();

    private static List<Task> load() {
        // TODO: 6/15/2022 load data from file here

        return new ArrayList<>();
    }
    @Override
    public void create(Task entity) {
        entity.setId(System.currentTimeMillis());
        entity.setCreatedAt(LocalDateTime.now());
        tasks.add(entity);
    }

    @Override
    public void update(Task entity) {
        tasks.add(entity);
    }

    @Override
    public void deleteByID(Long id) {
        for (Task task : tasks) {
            if(task.getId().equals(id)){
                tasks.remove(task);
                break;
            }
        }
    }

    @Override
    public Optional<Task> findById(Long id) {
        return tasks.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<List<Task>> findAll(TaskCriteria criteria) {
        return Optional.of(tasks);
    }

    public static TaskRepository getInstance() {
        if (instance == null) {
            instance = new TaskRepository();
        }
        return instance;
    }

    public Optional<Task> findByUsername(String name) {
        return tasks.stream()
                .filter(task -> task.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}