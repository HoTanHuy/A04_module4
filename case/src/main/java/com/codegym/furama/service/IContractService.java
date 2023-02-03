package com.codegym.furama.service;

import com.codegym.furama.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findAllContract(Pageable pageable);

    void insert(Contract contract);
}
