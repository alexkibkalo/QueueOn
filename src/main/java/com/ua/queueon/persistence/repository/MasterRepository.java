package com.ua.queueon.persistence.repository;

import com.ua.queueon.persistence.index.Master;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MasterRepository extends ElasticsearchRepository<Master, String> {

}
