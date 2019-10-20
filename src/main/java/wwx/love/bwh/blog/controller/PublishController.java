package wwx.love.bwh.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wwx
 * @date 2019/10/20 20:05
 */
@Controller
public class PublishController {
    @GetMapping("/publisher")
    public String publish() {
        return "publish";
    }
}
