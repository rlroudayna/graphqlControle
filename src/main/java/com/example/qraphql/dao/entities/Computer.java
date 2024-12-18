package com.example.qraphql.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Computer {
    @Id
    @GeneratedValue
    private int id_Pc;
     String proce;
     String ram;
     String hardDrive;
     int price;
     String macAdresse;






}
