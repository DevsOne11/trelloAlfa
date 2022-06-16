package uz.jl.jira.repository.auth;

import uz.jl.jira.criteria.ProjectColumnCriteria;
import uz.jl.jira.domains.auth.ProjectColumn;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:16   16/06/22
 * @Project :  trelloAlfa
 */
public class ProjectColumnRepository implements GenericCRUDRepository<ProjectColumn, ProjectColumnCriteria,Long> {
    @Override
    public void create(ProjectColumn entity) {

    }

    @Override
    public void update(ProjectColumn entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<ProjectColumn> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<List<ProjectColumn>> findAll(ProjectColumnCriteria criteria) {
        return Optional.empty();
    }
}
