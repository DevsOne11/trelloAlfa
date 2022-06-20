package uz.jl.jira.mappers;

import uz.jl.jira.domains.auth.Project;
import uz.jl.jira.vo.auth.projectVO.ProjectVO;

import java.time.LocalDateTime;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  09:22   20/06/22
 * @Project :  trelloAlfa
 */
public class ProjectMapper {
    private static ProjectMapper instance;

    public static Project getProject(ProjectVO projectVO){
        Project project = new Project();
        project.setName(projectVO.getName());
        project.setId(System.currentTimeMillis());
        project.setCreatedAt(LocalDateTime.now());
        project.setCreatedBy(projectVO.getId());

        return project;
    }

    public static ProjectMapper getInstance() {

        if (instance == null){
            instance = new ProjectMapper();
        }
        return instance;
    }

    public ProjectVO getProjectVo(Project project) {

        ProjectVO projectVO = new ProjectVO();
        projectVO.setId(project.getId());
        projectVO.setName(project.getName());
        projectVO.setDeadline(project.getDeadline());
        projectVO.setCreatedBy(project.getCreatedBy());
        projectVO.setCreatedAt(project.getCreatedAt());
        projectVO.setBlocked(project.isBlocked());
        projectVO.setDeleted(project.isDeleted());
        projectVO.setColumns(project.getColumns());
        projectVO.setMembers(project.getMembers());
        return projectVO;

    }
}
