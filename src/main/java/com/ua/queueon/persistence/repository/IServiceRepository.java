package com.ua.queueon.persistence.repository;

import com.ua.queueon.persistence.index.IService;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IServiceRepository extends ElasticsearchRepository<IService, String> {
}
