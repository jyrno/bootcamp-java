package ee.proekspert.florianb;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Answer {

    private final int questionId;
    private final int answerId;
    private final String answer;
    private final boolean correctness;

    public Answer(int questionId, int answerId, String answer, boolean correctness) {
        this.questionId = questionId;
        this.answerId = answerId;
        this.answer = answer;
        this.correctness = correctness;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrectness() {
        return correctness;
    }
}
