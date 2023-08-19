package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.PaymentDTO;
import com.nctech.flipcart.repository.RepositoryPaymentI;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryPaymentImpl;
import com.nctech.flipcart.sevices.PaymentServices;

import java.util.List;

public class PaymentServicesImpl implements PaymentServices {
    RepositoryPaymentImpl repositoryPayment = new RepositoryPaymentImpl();
    @Override
    public void save(PaymentDTO payment) {
        repositoryPayment.save(payment);
    }

    @Override
    public PaymentDTO findById(int id) {
        for (PaymentDTO payment : repositoryPayment.get()
             ) {
            if(payment.getId()==id){
                return payment;
            }
        }
        return null;
    }

    @Override
    public List<PaymentDTO> findAll() {
        return repositoryPayment.get();
    }

    @Override
    public void update(PaymentDTO payment) {
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setPrice(paymentDTO.getPrice());
        paymentDTO.setPin(paymentDTO.getPin());
        paymentDTO.setOtp(paymentDTO.getOtp());
        paymentDTO.setUpiId(paymentDTO.getUpiId());
        paymentDTO.setCardNumber(paymentDTO.getCardNumber());
        paymentDTO.setCashOnDelevary(paymentDTO.getCashOnDelevary());
    }

    @Override
    public void delete(int id) {
PaymentDTO paymentDTO = findById(id);
repositoryPayment.get().remove(paymentDTO);

    }
}
