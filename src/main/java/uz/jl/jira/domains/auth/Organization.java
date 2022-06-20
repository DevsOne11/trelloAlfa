package uz.jl.jira.domains.auth;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@ToString
public class Organization extends Auditable{

    // TODO: 16/06/22   MAKING CRUD 
    private Long id;
    private String name;
    private Long ownerId;
    private List<Long> projects = new ArrayList<>();
    private Map<Long, String> members = new HashMap<>();
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private Boolean deleted;
    private Boolean blocked;
}
