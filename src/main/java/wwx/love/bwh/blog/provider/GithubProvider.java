package wwx.love.bwh.blog.provider;

import com.alibaba.fastjson.JSON;
import okhttp3.*;
import org.springframework.stereotype.Component;
import wwx.love.bwh.blog.dto.AccessTokenDto;
import wwx.love.bwh.blog.dto.GithubUser;

import java.io.IOException;

/**
 * @author wwx
 * @date 2019/10/20 10:08
 */
@Component
public class GithubProvider {

    public String getAccessToken(AccessTokenDto accessTokenDto){
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient okHttpClient = new OkHttpClient();


        String url = "https://github.com/login/oauth/access_token";

        RequestBody requestBody = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDto));
        Request request = new Request.Builder().url(url).post(requestBody).build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            String string = response.body().string();
            String token = string.split("&")[0].split("=")[1];
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public GithubUser getUser(String accessToken) {
        String url = "https://api.github.com/user?access_token=";
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url + accessToken).build();

        try {
            Response response = okHttpClient.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);
            return githubUser;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
