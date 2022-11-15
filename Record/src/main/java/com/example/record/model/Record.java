package com.example.record.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Record {
     private  String name;
    private  Integer age;
    private String breed;
    private  Integer weight;
}
