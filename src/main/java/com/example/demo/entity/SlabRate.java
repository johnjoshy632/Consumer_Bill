package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SLAB_RATE")
public class SlabRate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer RNo;
    private Integer IR;
    private Integer FR;
    private float rate;

}
