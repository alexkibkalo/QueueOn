package com.ua.queueon.persistence.repository;

import com.ua.queueon.persistence.index.Record;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RecordRepository extends ElasticsearchRepository<Record, String> {
}
