package uz.jl.jira.mappers;

import uz.jl.jira.domains.auth.User;
import uz.jl.jira.vo.auth.userVO.UserVO;

import java.time.LocalDateTime;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  09:16   20/06/22
 * @Project :  trelloAlfa
 */
public class UserMapper {
    private static UserMapper instance;
    public  User getUser(UserVO userVO){
        User user = new User();
        user.setId(userVO.getId());
        user.setUserName(userVO.getUserName());
        user.setPassword(userVO.getPassword());
        user.setEmail(userVO.getEmail());
        user.setCreatedAt(LocalDateTime.now());
        return user;
    }

    public  UserVO getUserVO(User user){

        UserVO userVO = new UserVO();
        userVO.setId(user.getId());
        userVO.setUserName(user.getUserName());
        userVO.setPassword(user.getPassword());
        userVO.setCreatedAt(LocalDateTime.now());
        userVO.setUpdatedAt(user.getUpdatedAt());
        userVO.setEmail(user.getEmail());
        return userVO;

    }

    public static UserMapper getInstance() {
        if (instance == null) {
            instance = new UserMapper();
        }
        return instance;
    }

}
