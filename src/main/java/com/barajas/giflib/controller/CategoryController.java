package com.barajas.giflib.controller;

import com.barajas.giflib.data.CategoryRepository;
import com.barajas.giflib.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * Created by jbara on 4/24/2018.
 */

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/categories")
    public String categories(ModelMap modelMap){
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

}
