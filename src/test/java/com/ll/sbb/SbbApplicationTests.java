package com.ll.sbb;

import com.ll.sbb.answer.Answer;
import com.ll.sbb.answer.AnswerRepository;
import com.ll.sbb.question.Question;
import com.ll.sbb.question.QuestionForm;
import com.ll.sbb.question.QuestionRepository;
import com.ll.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa(QuestionForm questionForm) {
        for (int i = 1; i <= 300; i++) {
            questionForm.setSubject(String.format("테스트 데이터입니다:[%03d]", i));
            questionForm.setContent("내용무");
            questionForm.setSiteUser(null);
            this.questionService.create(questionForm);
        }
    }
}
