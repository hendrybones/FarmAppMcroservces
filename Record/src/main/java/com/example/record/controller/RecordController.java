package com.example.record.controller;

import com.example.record.model.RecordRequest;
import com.example.record.service.RecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("ap/v1/records")
public record RecordController(RecordService recordService) {
    //create record
    @PostMapping
    public void createRecord(@RequestBody RecordRequest recordRequest){
        log.info("new record created{}",recordRequest);
        recordService.createRecord(recordRequest);
    }
}
