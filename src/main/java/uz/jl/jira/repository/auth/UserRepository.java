package uz.jl.jira.repository.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.jira.configs.ApplicationContextHolder;
import uz.jl.jira.configs.BaseConfig;
import uz.jl.jira.criteria.UserCriteria;
import uz.jl.jira.domains.auth.User;
import uz.jl.jira.mappers.UserMapper;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/14:45 (Tuesday)
 * jira/IntelliJ IDEA
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRepository implements GenericCRUDRepository<User, UserCriteria, Long> {

    private static UserRepository instance;
    private static Gson gson = ApplicationContextHolder.getBean(Gson.class);
    private static final List<User> users = load();
    private static UserMapper userMapper = ApplicationContextHolder.getBean(UserMapper.class);

    /**
     * loading users list from database
     * @return list of users
     */

    private static List<User> load() {
        // TODO: 6/15/2022 load data from file here

        try{

            FileReader reader = new FileReader("src/main/resources/users.json");
            Type type = new TypeToken<List<User>>(){}.getType();
            List<User> userList = gson.fromJson(reader, type);
            if (userList==null){
                userList = new ArrayList<>();
            }
            return userList;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * creating the user and adding to the list
     * @param  entity of user
     */
    @Override
    public void create(User entity) {
        users.add(entity);
    }

    /**
     * updating the user
     * @param entity of user
     */
    @Override
    public void update(User entity) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId()==entity.getId()){
                users.set(i, entity);
            }
        }
    }

    /**
     * Deleting user
     * @param id - ID of user that is deleting
     */
    @Override
    public void deleteByID(Long id) {
        for (User user : users) {
            if(user.getId().equals(id)){
                users.remove(user);
                break;
            }
        }
    }

    /**
     * Finding user by ID
     * @param id entity id
     * @return found user
     * @see Optional
     */
    @Override
    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    /**
     * @param criteria
     * @return
     */
    @Override
    public Optional<List<User>> findAll(UserCriteria criteria) {
        Optional<List<User>> users1 = Optional.of(users);
        return users1;
    }


    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public Optional<User> findByUsername(String userName) {
        return users.stream()
                .filter(user -> user.getUserName().equalsIgnoreCase(userName))
                .findFirst();
    }

    public void addOrgToUser(Long userId, Long orgId) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(userId)){
                users.get(i).addOrganization(orgId);
            }
        }
    }
}
