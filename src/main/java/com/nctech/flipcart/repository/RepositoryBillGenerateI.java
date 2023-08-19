package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.BillGenarateDTO;

import java.util.List;

public interface RepositoryBillGenerateI {
    public void save(BillGenarateDTO billGenarate);

    public List<BillGenarateDTO> get();
}
