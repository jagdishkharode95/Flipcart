package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.ProductDB;
import com.nctech.flipcart.dtos.ProductDto;
import com.nctech.flipcart.repository.RepositoryProductI;

import java.util.List;

public class RepositoryProductImpl implements RepositoryProductI {
    @Override
    public void save(ProductDto product) {
        ProductDB.products.add(product);
    }

    @Override
    public List<ProductDto> get() {
        return ProductDB.products;
    }
}
