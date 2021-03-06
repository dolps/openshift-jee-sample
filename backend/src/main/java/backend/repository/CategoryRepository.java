package backend.repository;

import backend.annotations.Repository;
import backend.entity.Category;
import backend.entity.SubCategory;
import backend.entity.SubSubCategory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dolplads on 14/11/2016.
 */
@Repository
@SuppressWarnings("unchecked")
public class CategoryRepository extends CrudRepository<Long, Category> {
    public CategoryRepository() {
        super(Category.class);
    }

    public List<Category> findAllWithAtLeastOneSubCategoryWithAtLeastOnSubSubCategoryWithAtLeastOneQuiz() {
        List<SubSubCategory> subCategoriesAssociatedWithQuiz =
                entityManager
                        .createQuery("select quiz.subSubCategory from Quiz quiz")
                        .getResultList();

        Set<Category> associatedCategories = new HashSet<>();
        for (SubSubCategory c : subCategoriesAssociatedWithQuiz) {
            SubCategory subC = c.getParentCategory();
            associatedCategories.add(subC.getParentCategory());
        }

        return new ArrayList<>(associatedCategories);
    }
}
