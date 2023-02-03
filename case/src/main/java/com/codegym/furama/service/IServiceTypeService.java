package com.codegym.furama.service;

import com.codegym.furama.model.facility.ServiceType;

import java.util.List;

public interface IServiceTypeService {
    List<ServiceType> findAllService();
}
