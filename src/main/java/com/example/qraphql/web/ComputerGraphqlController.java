package com.example.qraphql.web;

import com.example.qraphql.dto.ComputerDto;
import com.example.qraphql.service.ComputerService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphqlController {
    public ComputerService computerService;
@MutationMapping
public ComputerDto saveComputer(@Argument ComputerDto computerDto){
 return computerService.saveComputer(computerDto);
}

@QueryMapping
    public List<ComputerDto> getComputerByProce(String proce){
    return computerService.getComputerByProce(proce);

}
}
