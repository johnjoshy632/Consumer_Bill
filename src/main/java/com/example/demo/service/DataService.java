package com.example.demo.service;

import com.example.demo.entity.ConsumerData;
import com.example.demo.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DataService {

    @Autowired
    private ConsumerRepository repository;

        public ConsumerData saveConsumerData(ConsumerData consumerData){
            return repository.save(consumerData);
        }

        public List<ConsumerData> saveConsumerDatas(List<ConsumerData> consumerDatas){
            return repository.saveAll(consumerDatas);
        }
        public List<ConsumerData> getConsumerDatas(){
            return repository.findAll();
        }
        public ConsumerData getConsumerDataById(Integer id){
            return repository.findById(id).orElse(null);
        }

        public String deleteConsumerData(Integer id){
            repository.deleteById(id);
        return "consumerData removed!!"+id;
    }
        public ConsumerData updateConsumerData(ConsumerData consumerData){
        ConsumerData cds=repository.findById(consumerData.getCons_id()).orElse(null);
        cds.setName(consumerData.getName());
        cds.setPhNo(consumerData.getPhNo());
        return repository.save(cds);
    }
}
