package com.rollerfdeveloper.demotest.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MainService {
    private NestService nestService;

    public void setIdNestService(int id) {
        if (id > 0) {
            nestService.setId(id);
        }
    }

    @Autowired
    void setNestService(NestService nestService) {
        this.nestService = nestService;
    }
}
