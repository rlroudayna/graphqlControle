package com.example.qraphql;

import com.example.qraphql.dto.ComputerDto;
import com.example.qraphql.service.ComputerService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class qraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(qraphqlApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerService computerService) {
        return args -> {
            computerService.saveComputers(
                    List.of(
                            ComputerDto.builder().proce("Intel i7").ram("16GB").price(1200).hardDrive("512GB SSD").build(),
                            ComputerDto.builder().proce("Intel i5").ram("8GB").price(800).hardDrive("256GB SSD").build(),
                            ComputerDto.builder().proce("AMD 7").ram("16GB").price(1000).build(),
                            ComputerDto.builder().proce("Intel i9").ram("32GB").price(2000).hardDrive("1TB SSD").build()
                    )
            );


            // Save each computer in the list
        };
    }
}
