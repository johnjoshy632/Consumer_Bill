package com.example.demo.repository;

import com.example.demo.entity.SlabRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<SlabRate, Integer > {

    SlabRate findByRNo(Integer rNo);
    void deleteAllByRNo(Integer rNo);
}
