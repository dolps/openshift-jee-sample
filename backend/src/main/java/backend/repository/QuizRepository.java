package backend.repository;

import backend.entity.Quiz;

/**
 * Created by dolplads on 21/11/2016.
 */
public class QuizRepository extends CrudRepository<Long, Quiz> {
    public QuizRepository() {
        super(Quiz.class);
    }
}
