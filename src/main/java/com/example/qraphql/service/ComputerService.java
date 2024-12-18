package com.example.qraphql.service;

import com.example.qraphql.dto.ComputerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComputerService {
    public ComputerDto saveComputer(ComputerDto computerDto);
    public List<ComputerDto> getComputerByProce(String proce);
    public List<ComputerDto> saveComputers(List<ComputerDto> computerDtos);

}
