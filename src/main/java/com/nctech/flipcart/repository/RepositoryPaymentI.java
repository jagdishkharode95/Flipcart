package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.PaymentDTO;

import java.util.List;

public interface RepositoryPaymentI {
    void save(PaymentDTO payment);
    List<PaymentDTO> get();
}
