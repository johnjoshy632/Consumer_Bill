package com.example.demo.repository;

import com.example.demo.entity.ConsumerReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface ReadingRepository extends JpaRepository<ConsumerReading, Integer> {

    @Query (value = "select max(time) from consumer_reading where cons_id=?", nativeQuery = true )
    LocalDateTime getPR(Integer id);

    @Query(value = "select cr from consumer_reading  where time=?", nativeQuery = true)
    Float getCR (LocalDateTime dateTime);


}
