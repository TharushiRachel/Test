package com.example.HMS.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue
    private int id;
    private String name;


}
