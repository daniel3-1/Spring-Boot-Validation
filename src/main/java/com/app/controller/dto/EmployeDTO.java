package com.app.controller.dto;

import com.app.advice.anotation.ValidName;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeDTO {

    @ValidName
    private String name;

    @ValidName
    private String lastName;

    private String email;
    private Long phone;
    private byte age;
    private double height;
    private boolean married;
    private LocalDate dateOfBirth;
    private DepartmentDTO departmentDTO;
}
