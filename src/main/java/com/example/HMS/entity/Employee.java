package com.example.HMS.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String nic;
    private String full_name;
    private String address;



}
