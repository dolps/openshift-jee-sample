package backend.service;


import backend.entity.SubSubCategory;
import backend.repository.SubSubCategoryRepository;
import lombok.NoArgsConstructor;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by dolplads on 21/11/2016.
 */
@Stateless
@NoArgsConstructor
public class SubSubCategoryService extends CommonCRUDService<Long, SubSubCategory> {
    private SubSubCategoryRepository subSubCategoryRepository;

    @Inject
    public SubSubCategoryService(SubSubCategoryRepository subSubCategoryRepository) {
        super(subSubCategoryRepository);
        this.subSubCategoryRepository = subSubCategoryRepository;
    }
}
