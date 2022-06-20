package uz.jl.jira.ui;

import uz.jl.jira.services.auth.UserService;
import uz.jl.jira.utils.Reader;
import uz.jl.jira.utils.Util;
import uz.jl.jira.vo.auth.userVO.UserCreateVO;
import uz.jl.jira.vo.auth.userVO.UserVO;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ErrorVO;
import uz.jl.jira.vo.response.ResponseEntity;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:53   18/06/22
 * @Project :  trelloAlfa
 */
public class Registration {
    private static Registration instance;
    public void registration(){
        while (true){
            Util.clear();
            switch (Util.menu(List.of("REGISTRATION", "0. Exit", "1. Sign in", "2. Sign up"))){
                case "0" -> {return;}
                case "1" -> signIn();
                case "2" -> signUp();
            }
        }
    }

    private void signIn() {
//        Util.clear();
//        Util.middle("SIGN IN");
//        UserVO userVO = new UserVO();
//        userVO.setUsername(Reader.readLine("Username: "));
//        userVO.setPassword(Reader.readLine("Password: "));
//        ResponseEntity<Data<UserVO>> response = UserService.getInstanse().checkForLogIn(userVO);
//        if(!response.getData().isSuccess()){
//            Util.error(response.getData().getError().getFriendlyMessage());
//            Util.pause();
//        }else {
//            Util.success("Successfully signed in");
//            Util.pause();
//            Session.getInstance().setSessionUserVO(response.getData().getBody());
//            switch (Session.getInstance().sessionUserVO.getUserRole()){
//                case SUPER_ADMIN -> SuperAdminPage.getInstance().mainMenu();
//            }
//        }
    }

    private void signUp() {
        Util.clear();
        Util.middle("SIGN UP");
        UserCreateVO userCreateVO = new UserCreateVO();
        userCreateVO.setUsername(Reader.readLine("Username: "));
        userCreateVO.setPassword(Reader.readLine("Password: "));
        ResponseEntity<Data<Long>> dataResponseEntity = UserService.getInstance().create(userCreateVO);

        if(!dataResponseEntity.getData().isSuccess()){
            ErrorVO error = dataResponseEntity.getData().getError();
            Util.error(error.getFriendlyMessage());
            Util.pause();
        }else {
            Util.success("Successfully signed up");
            Util.pause();
        }
    }

    public static Registration getInstance() {
        if(instance == null){
            instance = new Registration();
        }
        return instance;
    }
}
