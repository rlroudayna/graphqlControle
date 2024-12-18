package com.example.qraphql.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ComputerDto {
    private String proce;
    private String ram;
    private int price;  // Change this to int instead of String
    private String hardDrive;
}
