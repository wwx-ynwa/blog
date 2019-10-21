package wwx.love.bwh.blog.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author wwx
 * @date 2019/10/20 14:35
 */
@Data
@ToString
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String bio;
    private String avatarUrl;
}
