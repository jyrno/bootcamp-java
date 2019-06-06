package ee.proekspert.florianb;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Answer {

    @GeneratedValue
    @Id
    public long answerId;

    private final long questionId;
    private final String answer;
    private final boolean correctness;

    public Answer(long questionId, long answerId, String answer, boolean correctness) {
        this.questionId = questionId;
        this.answerId = answerId;
        this.answer = answer;
        this.correctness = correctness;
    }

    public long getQuestionId() {
        return questionId;
    }

    public long getAnswerId() {
        return answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return correctness;
    }
}
