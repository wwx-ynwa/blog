package wwx.love.bwh.blog.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author wwx
 * @date 2019/10/20 20:59
 */
@Data
@ToString
public class Question {
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
}
