package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.OrderDB;
import com.nctech.flipcart.dtos.OrderDTO;
import com.nctech.flipcart.repository.RepositoryOrderI;

import java.util.List;

public class RepositoryOrderImpl implements RepositoryOrderI {
    @Override
    public void save(OrderDTO order) {
        OrderDB.orders.add(order);
    }

    @Override
    public List<OrderDTO> get() {
        return OrderDB.orders;
    }
}
