package com.mck.exotourista;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="hotels")
@AllArgsConstructor
public class Exotourista {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String name;

    @Column(columnDefinition = "TEXT")
    private String short_dsrp;

    @Column(columnDefinition = "TEXT")
    private String long_dsrp;

    private String location;
    private String experience;
    private Boolean pool;
    private int price;
    private String image;
    
    public Exotourista(){

    }
    
}
