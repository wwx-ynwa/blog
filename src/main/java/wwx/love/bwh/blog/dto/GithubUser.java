package wwx.love.bwh.blog.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author wwx
 * @date 2019/10/20 10:36
 */
@Data
@ToString
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
