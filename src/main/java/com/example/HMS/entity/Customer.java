package com.example.HMS.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name="customer")

public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nic;
    private String fullNname;
    private String address;
    private String dob;
    private int contactNno;
    private String email;
    private String password;

//    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "customer")
//    private Hall hall;


    }
