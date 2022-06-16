package uz.jl.jira.domains.auth;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:38   16/06/22
 * @Project :  trelloBeta
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Organization extends Auditable{

    // TODO: 16/06/22   MAKING CRUD 
    private Long id;
    private String name;
    private User owner;
    private List<Project> projectList;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
