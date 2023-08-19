package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.OrderDTO;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryOrderImpl;
import com.nctech.flipcart.sevices.OrderServices;

import java.util.List;

public class OrderServicesImpl implements OrderServices {
    RepositoryOrderImpl repositoryOrder = new RepositoryOrderImpl();
    @Override
    public void save(OrderDTO order) {
        repositoryOrder.save(order);
    }

    @Override
    public OrderDTO findById(int id) {
        for (OrderDTO order:repositoryOrder.get()
             ) {
            if (order.getId()==id){
                return order;
            }
        }
        return null;
    }

    @Override
    public List<OrderDTO> findAll() {
        return repositoryOrder.get();
    }

    @Override
    public void update(OrderDTO order) {
        OrderDTO orderDTO= new OrderDTO();
        orderDTO.setAddress(orderDTO.getAddress());
        orderDTO.setPrice(orderDTO.getPrice());
        orderDTO.setUserId(orderDTO.getUserId());
        orderDTO.setMobileNumber(orderDTO.getMobileNumber());
    }

    @Override
    public void delete(int id) {
        OrderDTO orderDTO= findById(id);
        repositoryOrder.get().remove(orderDTO);
    }
}
