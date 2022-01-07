package com.ua.queueon.service.iservice;

import com.ua.queueon.persistence.index.IService;

public interface IServiceService {

    Iterable<IService> findAllServices();

    void createService();
}
