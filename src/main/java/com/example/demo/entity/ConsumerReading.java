package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONSUMER_READING")
public class ConsumerReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cons_id")
    private Integer cons_id;
    private LocalDateTime time;
    private Float PR;
    private Float CR;
    private Float UC;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCons_id() {
        return cons_id;
    }

    public void setCons_id(Integer cons_id) {
        this.cons_id = cons_id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Float getPR() {
        return PR;
    }

    public void setPR(Float PR) {
        this.PR = PR;
    }

    public Float getCR() {
        return CR;
    }

    public void setCR(Float CR) {
        this.CR = CR;
    }

    public Float getUC() {
        return UC;
    }

    public void setUC(Float UC) {
        this.UC = UC;
    }
}
