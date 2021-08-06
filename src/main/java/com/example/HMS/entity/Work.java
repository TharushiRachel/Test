package com.example.HMS.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="work")
public class Work {

    @Id
    private int emp_id;

    @Id
    private int dept_id;
}
