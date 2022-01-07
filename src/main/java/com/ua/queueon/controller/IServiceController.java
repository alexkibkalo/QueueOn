package com.ua.queueon.controller;

import com.ua.queueon.persistence.index.IService;
import com.ua.queueon.service.iservice.IServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
@RequiredArgsConstructor
public class IServiceController {

    private final IServiceService customerService;

    @GetMapping
    public Iterable<IService> findAllServices(){
        return customerService.findAllServices();
    }

    @GetMapping("/new")
    public void createService(){
        customerService.createService();
    }
}
