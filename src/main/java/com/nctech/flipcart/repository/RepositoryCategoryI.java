package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.CategoryDTO;

import java.util.List;

public interface RepositoryCategoryI {
    void save (CategoryDTO category);
    List<CategoryDTO> get();
}
