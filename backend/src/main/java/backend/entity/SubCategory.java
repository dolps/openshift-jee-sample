package backend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by dolplads on 03/11/2016.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class SubCategory extends SuperCategory {
    @ManyToOne
    @JoinColumn
    private Category parentCategory;

    @OneToMany(mappedBy = "parentCategory")
    private List<SubSubCategory> childCategories;

    public SubCategory(Category parentCategory, String categoryText) {
        super(categoryText);
        this.parentCategory = parentCategory;
    }
}
