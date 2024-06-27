package org.example.dto;

import org.example.Main;

import java.math.BigDecimal;

public record EmployeeDto(
       int Emp_ID,
       String Emp_Name,
       String Department_Name,
       int Office_id,
       BigDecimal Salary,
       Long phone_number,
       String Emp_position
) {



}
