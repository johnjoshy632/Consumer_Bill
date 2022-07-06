package com.example.demo.controller;

import com.example.demo.entity.ConsumerReading;
import com.example.demo.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReadingController {
    @Autowired
    private ReadingService Rservice;


        @PostMapping("/addReading1")
        public ConsumerReading SaveReading(@RequestBody ConsumerReading consumerReading){
            return Rservice.saveConsumerReading(consumerReading);
        }

        @PostMapping("/addConsumerReadings")
        public List<ConsumerReading> saveConsumerReadings(@RequestBody List<ConsumerReading> consumerReadings){
            return Rservice.saveConsumerReadings(consumerReadings);
        }

        @GetMapping("/Readings")
        public List<ConsumerReading> findAll(){
            return Rservice.getConsumerReadings();
        }

        @GetMapping("/Readings/{id}")
        public ConsumerReading getConsumerReadingsById(@RequestBody Integer id){
            return Rservice.getConsumerReadingsById(id);
        }

        @DeleteMapping("/deleteReading/{id}")
        public String deleteConsumerReading(@PathVariable Integer id) {
        return Rservice.deleteConsumerReading(id);
        }
}
