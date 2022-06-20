package uz.jl.jira.mappers;

import uz.jl.jira.domains.auth.Task;
import uz.jl.jira.vo.auth.taskVO.TaskVO;

import java.time.LocalDateTime;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  09:18   20/06/22
 * @Project :  trelloAlfa
 */
public class TaskMapper {
    public static Task getTask(TaskVO taskVO){
        Task task = new Task();
        task.setName(taskVO.getName());
        task.setId(System.currentTimeMillis());
        task.setCreatedAt(LocalDateTime.now());
        task.setCreatedBy(taskVO.getId());

        return task;
    }
}
