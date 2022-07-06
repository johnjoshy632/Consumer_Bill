package com.example.demo.service;

import com.example.demo.entity.SlabRate;
import com.example.demo.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class ServiceRate {

        @Autowired
        private RateRepository repository;

        public SlabRate addSlabRate(SlabRate slabRate){
        return repository.save(slabRate);
    }

        public List<SlabRate> addSlabRates(List<SlabRate> slabRates){
        return repository.saveAll(slabRates);
    }

        public List<SlabRate> getSlabRates(){
        return repository.findAll();
    }

        public SlabRate getSlabRateByRNo(Integer RNo){
        return repository.findByRNo(RNo);
    }

        public String deleteSlabRate(Integer rNo){
            repository.deleteAllByRNo(rNo);
            return "slabRate removed!!"+rNo;
        }

        public SlabRate updateSlabRate(SlabRate slabRate){
            SlabRate srate=repository.findByRNo(slabRate.getRNo());
            srate.setRNo(slabRate.getRNo());
            srate.setIR(slabRate.getIR());
            srate.setFR(slabRate.getFR());
            srate.setRate(slabRate.getRate());

            return repository.save(srate);
        }

}