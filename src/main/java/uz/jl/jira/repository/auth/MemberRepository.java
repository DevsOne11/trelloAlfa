package uz.jl.jira.repository.auth;

import uz.jl.jira.criteria.MemberCriteria;
import uz.jl.jira.domains.auth.Member;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  15:29   16/06/22
 * @Project :  trelloAlfa
 */
public class MemberRepository implements GenericCRUDRepository<Member, MemberCriteria,Long> {

    private static MemberRepository instance;
    @Override
    public void create(Member entity) {

    }

    @Override
    public void update(Member entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<Member> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Member>> findAll(MemberCriteria criteria) {
        return Optional.empty();
    }

    public static MemberRepository getInstance() {
        if (instance == null) {
            instance = new MemberRepository();
        }
        return instance;
    }
}
