package com.example.demo.service;

import com.example.demo.entity.BillAmount;
import com.example.demo.entity.ConsumerReading;
import com.example.demo.entity.SlabRate;
import com.example.demo.repository.BillRepository;
import com.example.demo.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReadingService {

    @Autowired
    private ReadingRepository repository;
    @Autowired
    private ServiceRate Sservice;
    @Autowired
    private BillRepository Brepository;

    public  ConsumerReading saveConsumerReading(ConsumerReading consumerReading) {
        ConsumerReading conr = new ConsumerReading();
        conr.setCR(consumerReading.getCR());
        conr.setCons_id(consumerReading.getCons_id());
        LocalDateTime ldt = repository.getPR(consumerReading. getCons_id());
        Float cr = repository.getCR(ldt);
        conr.setPR(cr);
        conr.setTime(LocalDateTime.now());
        Float uc = null;
        if (ldt == null) {
            conr.setPR(0.0F);
            uc = consumerReading.getCR();
        } else {
            uc = consumerReading.getCR() - cr;
            conr.setPR(cr);
        }

        conr.setUC(uc);
        Double ba = 0.0;


        List<SlabRate> slabList = Sservice.getSlabRates();
        SlabRate sl = new SlabRate();
        BillAmount bmt = new BillAmount();

        for (Integer i = 0; i < slabList.size(); i++) {
            sl = slabList.get(i);
            if (sl.getIR() <= uc && uc <= sl.getFR()) {
                ba = Double.valueOf(uc * sl.getRate());
                break;
            }

        }
        bmt.setBill(ba);
        bmt.setCons_id(consumerReading. getCons_id());
        Brepository.save(bmt);
        return repository.save(conr);
    }

    public List<ConsumerReading> saveConsumerReadings(List<ConsumerReading> consumerReadings){
        return repository.saveAll(consumerReadings);
    }
    public List<ConsumerReading> getConsumerReadings(){
        return repository.findAll();
    }
    public ConsumerReading getConsumerReadingsById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public String deleteConsumerReading(Integer id){
        repository.deleteById(id);
        return "consumerReading is remover!!"+id;
    }
}
