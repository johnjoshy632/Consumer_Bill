package com.example.demo.controller;

import com.example.demo.entity.SlabRate;
import com.example.demo.service.ServiceRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SlabController {

    @Autowired
    private ServiceRate Slservice;


    @PostMapping("/SlabRate")
    public SlabRate saveSlabRate(@RequestBody SlabRate slabRate){
        return Slservice.addSlabRate(slabRate);
    }

    @GetMapping("/ListSlabrate")
    public List<SlabRate> findAll(){
        return Slservice.getSlabRates();
    }

}
