package ee.proekspert.florianb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    List<Question> questionList = new ArrayList<>();
    Question question0 = new Question(0, "How many people work at Proekspert?", "207 people work at Proekspert");
    Question question1 = new Question(1, "When was Proekspert founded?", "In 1993. 2018 marked our 25th anniversary");


    @GetMapping("/a/{id}")
    Question x(@PathVariable int id) {
        questionList.add(question0);
        questionList.add(question1);
        Question question = questionList.get(id);

        return question;
    }

}
