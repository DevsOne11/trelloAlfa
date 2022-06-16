package uz.jl.jira.configs;

import uz.jl.jira.domains.auth.Organization;
import uz.jl.jira.domains.auth.Project;
import uz.jl.jira.domains.auth.ProjectColumn;
import uz.jl.jira.domains.auth.Task;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.auth.*;
import uz.jl.jira.services.auth.*;

public class ApplicationContextHolder {

    public static <T> T getBean(Class<T> clazz) {
        return switch (clazz.getSimpleName()) {
            case "UserService" -> (T) UserService.getInstance();
            case "UserRepository" -> (T) UserRepository.getInstance();
            case "BaseMapper" -> (T) new BaseMapper() {
            };

//            case "OrganizationService" -> (T) OrganizationService.getInstance();
//            case "OrganizationRepository" -> (T) OrganizationRepository.getInstance();
//
//            case "ProjectService" -> (T) ProjectService.getInstance();
//            case "ProjectRepository" -> (T) ProjectRepository.getInstance();
//
//            case "ProjectColumnService" -> (T) ProjectColumnService.getInstance();
//            case "ProjectColumnRepository" -> (T) ProjectColumnRepository.getInstance();
//
//            case "TaskService" -> (T) TaskService.getInstance();
//            case "TaskRepository" -> (T) TaskRepository.getInstance();
//
//            case "UserService" -> (T) UserService.getInstance();
//            case "UserRepository" -> (T) UserRepository.getInstance();
//
//            case "UserService" -> (T) UserService.getInstance();
//            case "UserRepository" -> (T) UserRepository.getInstance();






            default -> throw new RuntimeException("Bean with name '%s' not found".formatted(clazz.getSimpleName()));
        };
    }

}
