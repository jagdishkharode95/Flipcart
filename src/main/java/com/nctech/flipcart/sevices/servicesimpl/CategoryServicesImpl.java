package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.CategoryDTO;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryCategoryImpl;
import com.nctech.flipcart.sevices.CategoryServices;

import java.util.List;

public class CategoryServicesImpl implements CategoryServices {
    RepositoryCategoryImpl repositoryCategory = new RepositoryCategoryImpl();


    @Override
    public void save(CategoryDTO category) {
        repositoryCategory.save(category);
    }

    @Override
    public CategoryDTO findById(int id) {
        for (CategoryDTO category:repositoryCategory.get()) {
            if(category.getId()==id){
                return category;
            }

        }
        return null;
    }

    @Override
    public List<CategoryDTO> findall() {
        return repositoryCategory.get();
    }

    @Override
    public void update(CategoryDTO category) {
       CategoryDTO categoryDTO = new CategoryDTO();
       categoryDTO.setProductName(categoryDTO.getProductName());
       categoryDTO.setDiscription(categoryDTO.getDiscription());
    }

    @Override
    public void delete(int id) {
         CategoryDTO categoryDTO = findById(id);
         repositoryCategory.get().remove(categoryDTO);
    }
}
