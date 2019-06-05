package ee.proekspert.florianb;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private List<Question> questionList = new ArrayList<>();
    private Question question0 = new Question(0, "How many people work at Proekspert?", "207 people work at Proekspert");
    private Question question1 = new Question(1, "When was Proekspert founded?", "In 1993. 2018 marked our 25th anniversary");


    @GetMapping("/")
    Question x() {
        questionList.add(question0);
        questionList.add(question1);
        return questionList.stream().findFirst().get();
        // TODO: fix check for optional
    }

//    @PostMapping("/")
//    Answer y() {
//
//    }

}
