package com.example.demo.controller;

import com.example.demo.entity.BillAmount;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillController {

    @Autowired
    private BillService Bservice;

    @GetMapping("/Billamount")
    public List<BillAmount> findAllBillAmount(){
        return Bservice.getBillAmount();
    }

    @GetMapping("/Billamount/{id}")
    public BillAmount findAllBillAmount(@PathVariable Integer id){
        return Bservice.getBillAmountById(id);
    }
}
