package com.app.service;

import com.app.entities.Department;
import com.app.entities.Employe;
import com.app.persistence.EmployeRepository;
import org.springframework.stereotype.Service;
import com.app.controller.dto.EmployeDTO;

@Service
public class EmployeService {

    private EmployeRepository employeRepository;

    public EmployeService(EmployeRepository employeRepository){
        this.employeRepository = employeRepository;
    }

    public Employe saveEmploye(EmployeDTO employeDTO){
        Employe employe = Employe.builder()
                .name(employeDTO.getName())
                .lastName(employeDTO.getLastName())
                .email(employeDTO.getEmail())
                .phone(employeDTO.getPhone())
                .age(employeDTO.getAge())
                .height(employeDTO.getHeight())
                .married(employeDTO.isMarried())
                .dateOfBirth(employeDTO.getDateOfBirth())
                .department(Department.builder()
                        .name(employeDTO.getDepartmentDTO().getName())
                        .city(employeDTO.getDepartmentDTO().getCity())
                        .build())
                .build();
        return this.employeRepository.save(employe);
    }
}
