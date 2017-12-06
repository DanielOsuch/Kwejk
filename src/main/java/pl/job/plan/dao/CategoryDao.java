package pl.job.plan.dao;


import pl.job.plan.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> category();
    Category findCategoryById(int id);
    List<Category> findAllCategory();
    Category findCategoryByName(String name);


}
