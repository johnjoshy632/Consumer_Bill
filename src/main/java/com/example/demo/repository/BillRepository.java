package com.example.demo.repository;


import com.example.demo.entity.BillAmount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<BillAmount, Integer> {
}
