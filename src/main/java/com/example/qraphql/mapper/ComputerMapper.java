package com.example.qraphql.mapper;

import com.example.qraphql.dao.entities.Computer;
import com.example.qraphql.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper  mapper = new ModelMapper();

    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDto.class);
    }
}
