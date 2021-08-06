package com.example.HMS.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="emp_leave")

public class Employee_leave {

   @Id
    private int employee_id;
   @Id
    private int admin_id;
   private Date apply_date;
   private Date start_date;
   private Date end_date;


}
