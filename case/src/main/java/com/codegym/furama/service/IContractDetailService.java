package com.codegym.furama.service;


import com.codegym.furama.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findAllContractDetail();

    void insert(ContractDetail contractDetail);
}
