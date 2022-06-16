package uz.jl.jira.domains.auth;

import lombok.*;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  01:24   16/06/22
 * @Project :  trelloBeta
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Comment extends Auditable {
    private Long id;
    private String description;
    private User commentator;
}
