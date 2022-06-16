package uz.jl.jira.repository.auth;

import uz.jl.jira.criteria.TaskCriteria;
import uz.jl.jira.domains.auth.Task;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:24   16/06/22
 * @Project :  trelloAlfa
 */
public class TaskRepository implements GenericCRUDRepository<Task, TaskCriteria,Long> {

    private static TaskRepository instance;
    @Override
    public void create(Task entity) {

    }

    @Override
    public void update(Task entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<Task> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Task>> findAll(TaskCriteria criteria) {
        return Optional.empty();
    }
    public static TaskRepository getInstance() {
        if (instance == null) {
            instance = new TaskRepository();
        }
        return instance;
    }
}
