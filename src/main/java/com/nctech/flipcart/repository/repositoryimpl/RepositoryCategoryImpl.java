package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.CategoryDB;
import com.nctech.flipcart.dtos.CategoryDTO;
import com.nctech.flipcart.repository.RepositoryCategoryI;

import java.util.List;

public class RepositoryCategoryImpl implements RepositoryCategoryI {
    @Override
    public void save(CategoryDTO category) {
        CategoryDB.categories.add(category);
    }

    @Override
    public List<CategoryDTO> get() {
        return CategoryDB.categories;
    }
}
