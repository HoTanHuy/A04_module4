package com.codegym.furama.repository;


import com.codegym.furama.model.facility.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<Service, String> {
}
