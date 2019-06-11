package ee.proekspert.florianb;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTIONS")
@JsonInclude(JsonInclude.Include.NON_NULL)
class Question {

    @GeneratedValue
    @Id
    private long questionId;

    private final String questionText;
    private final String description;


    Question(int questionId, String questionText, String description) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.description = description;
    }

    public long getQuestionId() {
        return questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getDescription() {
        return description;
    }
}
