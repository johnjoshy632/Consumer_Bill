package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONSUMER_DATA")
public class ConsumerData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cons_id;
    private String name;
    private Long PhNo;

    public Long getPhNo() {
        return PhNo;
    }

    public void setPhNo(Long phNo) {
        PhNo = phNo;
    }

    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "cons_id")
    List<ConsumerReading> consumerReadingList;

    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "cons_id")
    List<BillAmount> bill;
}
