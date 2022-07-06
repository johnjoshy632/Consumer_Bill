package com.example.demo.service;

import com.example.demo.entity.BillAmount;
import com.example.demo.repository.BillRepository;
import com.example.demo.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository Brepository;

    @Autowired
    private ReadingRepository repository;

    public List<BillAmount> getBillAmount(){
        return Brepository.findAll();
    }

    public BillAmount getBillAmountById(Integer id){
        return Brepository.findById(id).orElse(null);
    }
}
