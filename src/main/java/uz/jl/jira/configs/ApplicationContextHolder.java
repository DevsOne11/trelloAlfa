package uz.jl.jira.configs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.jl.jira.domains.auth.*;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.auth.*;
import uz.jl.jira.services.auth.*;

public class ApplicationContextHolder {

    public static <T> T getBean(Class<T> clazz) {
        return switch (clazz.getSimpleName()) {
            case "UserService" -> (T) UserService.getInstance();
            case "UserRepository" -> (T) UserRepository.getInstance();


            case "OrganizationService" -> (T) OrganizationService.getInstance();
            case "OrganizationRepository" -> (T) OrganizationRepository.getInstance();

            case "ProjectService" -> (T) ProjectService.getInstance();
            case "ProjectRepository" -> (T) ProjectRepository.getInstance();

            case "ProjectColumnService" -> (T) ProjectColumnService.getInstance();
            case "ProjectColumnRepository" -> (T) ProjectColumnRepository.getInstance();

            case "TaskService" -> (T) TaskService.getInstance();
            case "TaskRepository" -> (T) TaskRepository.getInstance();

            case "CommentService" -> (T) CommentService.getInstance();
            case "CommentRepository" -> (T) CommentRepository.getInstance();

            case "MemberService" -> (T) MemberService.getInstance();
            case "MemberRepository" -> (T) MemberRepository.getInstance();


            case "BaseMapper" -> (T) new BaseMapper() {
            };

            default -> throw new RuntimeException("Bean with name '%s' not found".formatted(clazz.getSimpleName()));
        };
    }
    private static Gson gson;

    private static <T> T getGsonBean() {
        if(gson == null) {
            gson  = new GsonBuilder().setPrettyPrinting().create();
        }
        return (T)gson;
    }

}
