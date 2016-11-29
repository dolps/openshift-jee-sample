package backend.service;

import backend.entity.Category;
import backend.entity.SubCategory;
import backend.entity.SubSubCategory;
import backend.repository.CategoryRepository;
import backend.repository.SubCategoryRepository;
import backend.repository.SubSubCategoryRepository;
import lombok.NoArgsConstructor;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by dolplads on 14/11/2016.
 */
@Stateless
@NoArgsConstructor
public class CategoryService extends CommonCRUDService<Long, Category> {
    private CategoryRepository categoryRepository;
    private SubSubCategoryRepository subSubCategoryRepository;
    private SubCategoryRepository subCategoryRepository;

    @Inject
    public CategoryService(CategoryRepository categoryRepository, SubCategoryRepository subCategoryRepository, SubSubCategoryRepository subsubCategoryRepository) {
        super(categoryRepository);
        this.categoryRepository = categoryRepository;
        this.subCategoryRepository = subCategoryRepository;
        this.subSubCategoryRepository = subsubCategoryRepository;
    }

    public List<Category> findAllWithAtLeastOneSubCategoryWithAtLeastOneSubSubCategoryWithAtLeastOneQuiz() {
        return categoryRepository.findAllWithAtLeastOneSubCategoryWithAtLeastOnSubSubCategoryWithAtLeastOneQuiz();
    }

    //// TODO: 25/11/2016 maybe move to subsubcategoryservice?
    public List<SubSubCategory> findAllSubSubCategoriesWithAtLeastOneQuiz() {
        return subSubCategoryRepository.findAllSubSubCategoriesWithAtLeastOneQuiz();
    }

    public List<SubCategory> findAllSubCategoriesByParentCategory(Long parentId) {
        return subCategoryRepository.findAllByParentId(parentId);
    }
}
