package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.CategoryDTO;

import java.util.List;

public interface CategoryServices {
    void save(CategoryDTO category);
    CategoryDTO findById(int id);
    List<CategoryDTO> findall();
    void update(CategoryDTO category);
    void delete(int id);
}
