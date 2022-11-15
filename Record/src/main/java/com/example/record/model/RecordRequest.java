package com.example.record.model;

public record RecordRequest(
        String name,
          Integer age,
         String breed,
         Integer weight
) {
}

//record gives immutably to strings
