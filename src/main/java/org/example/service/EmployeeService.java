package org.example.service;

import org.example.dto.EmployeeDto;
import org.example.entity.UniversityStaff;
import org.example.repository.UniversityStaffRepository;

import java.util.List;

public interface EmployeeService {
UniversityStaffRepository createUniversityStaff(UniversityStaff employee);
List <UniversityStaff> getAllUniversityStaff();
UniversityStaff getEmpID(int EmpID);
    void updateUniversityStaff(EmployeeDto employeeDto);
    void deleteUniversityStaff(int EmpID) throws ClassNotFoundException;

    List<UniversityStaff> getAllEmployees();
}
