package com.codegym.furama.repository;

import com.codegym.furama.model.facility.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceTypeRepository extends JpaRepository<ServiceType, Integer> {
}
