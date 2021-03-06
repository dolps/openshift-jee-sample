package backend.repository;

import backend.entity.SubSubCategory;

import java.util.List;

/**
 * Created by dolplads on 21/11/2016.
 */
@SuppressWarnings("unchecked")
public class SubSubCategoryRepository extends CrudRepository<Long, SubSubCategory> {
    public SubSubCategoryRepository() {
        super(SubSubCategory.class);
    }

    public List<SubSubCategory> findAllSubSubCategoriesWithAtLeastOneQuiz() {
        return entityManager.createQuery("select c from SubSubCategory c where c.quiz != null")
                .getResultList();
    }
}
