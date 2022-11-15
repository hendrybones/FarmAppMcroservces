package com.example.record.service;

import com.example.record.model.RecordRequest;
import org.springframework.stereotype.Service;

@Service
public record RecordService() {
    public void createRecord(RecordRequest request) {
       Record record=Record.builder()
               .name(request.name())
               .breed(request.breed())
               .age(request.age())
               .weight(request.weight())
               .build();
    }
}
