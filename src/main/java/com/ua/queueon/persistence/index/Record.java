package com.ua.queueon.persistence.index;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Data
@Document(indexName = "record")
public class Record {

    @Id
    private String id;

    @Field(type = FieldType.Nested, name = "master")
    private Master master;

    @Field(type = FieldType.Nested, name = "iService")
    private IService iService;

    @Field(type = FieldType.Date, name = "timeFrom")
    private LocalDateTime timeFrom;

    @Field(type = FieldType.Date, name = "timeTo")
    private LocalDateTime timeTo;

    @Field(type = FieldType.Text, name = "address")
    private String address;

}
