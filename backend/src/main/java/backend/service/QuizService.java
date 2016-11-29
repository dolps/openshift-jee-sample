package backend.service;

import backend.entity.Quiz;
import backend.repository.QuizRepository;
import lombok.NoArgsConstructor;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by dolplads on 03/11/2016.
 */
@SuppressWarnings("unchecked")
@Stateless
@NoArgsConstructor
public class QuizService extends CommonCRUDService<Long, Quiz> {
    private QuizRepository quizRepository;

    @Inject
    public QuizService(QuizRepository quizRepository) {
        super(quizRepository);
        this.quizRepository = quizRepository;
    }
}
