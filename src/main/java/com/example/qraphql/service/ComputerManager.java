package com.example.qraphql.service;

import com.example.qraphql.dao.entities.Computer;
import com.example.qraphql.dao.repository.Computerrepository;
import com.example.qraphql.dto.ComputerDto;
import com.example.qraphql.mapper.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService {
private Computerrepository computerRepository;
private ComputerMapper mapper;

@Override
    public ComputerDto saveComputer(ComputerDto computerDto){
    Computer computer = mapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = mapper.fromComputerToComputerDto(computer);
        return computerDto;
}

    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDto> ComputerDtos = new ArrayList<>();
        for (Computer computer: computers) {
            ComputerDtos.add(mapper.fromComputerToComputerDto(computer));
        }
        return ComputerDtos;
    }

    @Override
    public List<ComputerDto> saveComputers(List<ComputerDto> computerDtos) {

        List<Computer> computers = new ArrayList<>();
        for (ComputerDto computerDto : computerDtos) {
            computers.add(mapper.fromComputerDtoToComputer(computerDto));
        }

        computers = computerRepository.saveAll(computers);

        computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(mapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }
}
