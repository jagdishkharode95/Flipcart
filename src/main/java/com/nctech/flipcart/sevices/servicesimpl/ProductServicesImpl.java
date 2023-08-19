package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.PaymentDTO;
import com.nctech.flipcart.dtos.ProductDto;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryProductImpl;
import com.nctech.flipcart.sevices.ProductServices;

import java.util.List;

public class ProductServicesImpl implements ProductServices {
    RepositoryProductImpl repositoryProduct = new RepositoryProductImpl();

    @Override
    public void save(ProductDto product) {
        repositoryProduct.save(product);
    }

    @Override
    public ProductDto findById(int id) {
        for (ProductDto product:repositoryProduct.get()
             ) {
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<ProductDto> findAll() {
        return repositoryProduct.get();
    }

    @Override
    public void update(ProductDto Payment) {
        ProductDto productDto=new ProductDto();
        productDto.setCategory(productDto.getCategory());
        productDto.setName(productDto.getName());
        productDto.setReviwe(productDto.getReviwe());
        productDto.setPrice(productDto.getPrice());
        productDto.setSpecification(productDto.getSpecification());
    }

    @Override
    public void delete(int id) {
        ProductDto productDto=findById(id);
        repositoryProduct.get().remove(productDto);
    }
}
