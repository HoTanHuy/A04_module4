package com.codegym.furama.service.impl;


import com.codegym.furama.model.contract.AttachService;
import com.codegym.furama.repository.IAttachServiceRepository;
import com.codegym.furama.service.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceServiceImpl implements IAttachServiceService {

    @Autowired
    IAttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> findAllAttachService() {
        return attachServiceRepository.findAll();
    }
}
