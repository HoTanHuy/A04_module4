package com.codegym.furama.repository;


import com.codegym.furama.model.cutomer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
