package wwx.love.bwh.blog.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author wwx
 * @date 2019/10/20 10:10
 */
@ToString
@Data
public class AccessTokenDto {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
