package ee.proekspert.florianb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTIONS")
@Getter
@Setter
@AllArgsConstructor
class Question {

    @GeneratedValue
    @Id
    private long questionId;

    private final String questionText;
    private final String description;
}