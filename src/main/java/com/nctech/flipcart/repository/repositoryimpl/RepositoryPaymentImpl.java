package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.PaymentDB;
import com.nctech.flipcart.dtos.PaymentDTO;
import com.nctech.flipcart.repository.RepositoryPaymentI;


import java.util.List;

public class RepositoryPaymentImpl implements RepositoryPaymentI {

    @Override
    public void save(PaymentDTO payment) {
        PaymentDB.payments.add(payment);

    }

    @Override
    public List<PaymentDTO> get() {
        return PaymentDB.payments;
    }
}
