package wwx.love.bwh.blog.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import wwx.love.bwh.blog.dto.QuestionDto;
import wwx.love.bwh.blog.mapper.QuestionMapper;
import wwx.love.bwh.blog.mapper.UserMapper;
import wwx.love.bwh.blog.model.Question;
import wwx.love.bwh.blog.model.User;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wwx
 * @date 2019/10/20 23:15
 */
@Service
public class QuestionService {
    @Resource
    private QuestionMapper questionMapper;
    @Resource
    private UserMapper userMapper;

    public List<QuestionDto> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDto> questionDtos = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDto questionDto = new QuestionDto();
            BeanUtils.copyProperties(question, questionDto);
            questionDto.setUser(user);
            questionDtos.add(questionDto);
        }
        return questionDtos;
    }
}
