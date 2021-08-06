package com.example.HMS.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="room")
public class Room {

    @Id
    @GeneratedValue
    private int id;
    private int num_of_rooms;
    private Date check_in_date;
    private Date check_out_date;


}
