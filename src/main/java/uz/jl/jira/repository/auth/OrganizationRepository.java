package uz.jl.jira.repository.auth;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.jira.criteria.OrganizationCriteria;
import uz.jl.jira.domains.auth.Organization;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:07   16/06/22
 * @Project :  trelloAlfa
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrganizationRepository implements GenericCRUDRepository<Organization, OrganizationCriteria,Long> {
    @Override
    public void create(Organization entity) {

    }

    @Override
    public void update(Organization entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<Organization> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Organization>> findAll(OrganizationCriteria criteria) {
        return Optional.empty();
    }
}
