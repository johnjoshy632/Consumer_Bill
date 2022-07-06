package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BILL_AMOUNT")
public class BillAmount {

    @Id
    @GeneratedValue
    private int BId;
    private double Bill;
    private Integer cons_id;


        public Integer getBid() {
        return BId;
    }

        public Integer getCons_id() {
         return cons_id;
        }
        public void setCons_id(Integer cons_id) {
        this.cons_id = cons_id;
    }

        public double getBill() {
        return Bill;
    }

        public void setBill(double bill) {
        this.Bill = bill;
    }
    }
