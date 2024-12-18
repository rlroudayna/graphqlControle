package com.example.qraphql.dao.repository;

import com.example.qraphql.dao.entities.Computer;
import com.example.qraphql.dto.ComputerDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Computerrepository extends JpaRepository<Computer,Long> {
    public List<Computer> findByProce(String proce);

}
