package com.barajas.giflib.data;

import com.barajas.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jbara on 4/24/2018.
 */

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"Technology"),
            new Category(2,"People"),
            new Category(3,"Destruction")
    );

    /**
     *Returns a category, stored in ALL_CATEGORIES, that matches
     * the category id searched for.
     * @param id the category id to be searched for
     * @return the category matching the id
     */
    public Category findById(int id){
        for (Category category : ALL_CATEGORIES) {
            if(category.getId()==id){
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }
}
