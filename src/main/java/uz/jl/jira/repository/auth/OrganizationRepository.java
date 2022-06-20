package uz.jl.jira.repository.auth;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.jira.criteria.OrganizationCriteria;
import uz.jl.jira.domains.auth.Organization;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:07   16/06/22
 * @Project :  trelloAlfa
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrganizationRepository implements GenericCRUDRepository<Organization, OrganizationCriteria, Long> {

    private static OrganizationRepository instance;

    private static final List<Organization> organizations = load();

    private static List<Organization> load() {
        // TODO: 6/15/2022 load data from file here

        return new ArrayList<>();
    }
    @Override
    public void create(Organization entity) {
        organizations.add(entity);
    }

    @Override
    public void update(Organization entity) {
        organizations.set(organizations.indexOf(entity), entity);
    }

    @Override
    public void deleteByID(Long id) {
        for (Organization organization : organizations) {
            if(organization.getId().equals(id)){
                organizations.remove(organization);
                break;
            }
        }
    }

    @Override
    public Optional<Organization> findById(Long id) {
        return organizations.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<List<Organization>> findAll(OrganizationCriteria criteria) {
        return Optional.of(organizations);
    }

//    public Optional<List<Organization>> findAllById(Long id) {
//        return Optional.of(organizations.stream().filter(org -> org.getOwnerId().equals(id)).toList());
//    }

    public static OrganizationRepository getInstance() {
        if (instance == null) {
            instance = new OrganizationRepository();
        }
        return instance;
    }

    public Optional<Organization> findByUsername(String name) {
        return organizations.stream()
                .filter(organization -> organization.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
