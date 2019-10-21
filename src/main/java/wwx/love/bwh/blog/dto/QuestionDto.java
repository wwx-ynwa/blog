package wwx.love.bwh.blog.dto;

import lombok.Data;
import lombok.ToString;
import wwx.love.bwh.blog.model.User;

/**
 * @author wwx
 * @date 2019/10/20 23:14
 */
@Data
@ToString
public class QuestionDto {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
