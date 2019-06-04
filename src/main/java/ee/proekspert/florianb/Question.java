package ee.proekspert.florianb;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
class Question {

    private final int questionId;
    private final String question;
    private final String description;
    private final Map<Integer, Answer> answerOptions = new HashMap<>();


    Question(int questionId, String question, String description) {
        this.questionId = questionId;
        this.question = question;
        this.description = description;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public String getDescription() {
        return description;
    }

    public void addAnswer(String answerText, boolean correctness) {
        Answer answer = new Answer(questionId, answerId, answerText, correctness);
        while (answerOptions.containsKey(answer.))
            answerOptions.put()
    }
}
