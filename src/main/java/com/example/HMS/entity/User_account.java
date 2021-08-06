package com.example.HMS.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="user_account")
public class User_account {

    @Id
    private int employee_id;
    @Id
    private String nic;
    private Date dob;
    private int contact_no;
    private String email;
    private String password;


}
