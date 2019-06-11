package ee.proekspert.florianb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANSWERS")
@Getter
@Setter
@AllArgsConstructor
public class Answer {

    @GeneratedValue
    @Id
    private long answerId;

    private final long questionId;
    private final String answer;
    private final boolean isCorrect;
}
