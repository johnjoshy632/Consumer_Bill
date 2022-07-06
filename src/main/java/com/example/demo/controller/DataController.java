package com.example.demo.controller;

import com.example.demo.entity.ConsumerData;
import com.example.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataService service;

    @PostMapping("/addConsumerData")
    public ConsumerData addConsumerData(@RequestBody ConsumerData consumerData){
        return service.saveConsumerData(consumerData);
    }
    @PostMapping("/addConsumerDatas")
    public List<ConsumerData> addConsumerDatas(@RequestBody List<ConsumerData> consumerDatas){
        return service.saveConsumerDatas(consumerDatas);
    }

    @GetMapping("/consumerDatas")
    public List<ConsumerData> findAllConsumerDatas(){
        return service.getConsumerDatas();
    }

    @GetMapping("/consumerData/{id}")
    public ConsumerData findAllConsumerData(@PathVariable Integer id){
        return  service.getConsumerDataById(id);
    }

    @PutMapping("/update")
    public ConsumerData updateConsumerData(@RequestBody ConsumerData consumerData){
        return service.updateConsumerData(consumerData);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteConsumerData(@PathVariable Integer id){
        return service.deleteConsumerData(id);
    }
}
