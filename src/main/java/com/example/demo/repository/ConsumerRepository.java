package com.example.demo.repository;

import com.example.demo.entity.ConsumerData;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConsumerRepository extends JpaRepository<ConsumerData, Integer> {

}
