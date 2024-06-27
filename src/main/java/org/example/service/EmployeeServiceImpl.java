package org.example.service;

import org.example.dto.EmployeeDto;
import org.example.entity.UniversityStaff;
import org.example.repository.UniversityStaffRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    UniversityStaffRepository universityStaffRepository;

    public UniversityStaffRepository getUniversityStaffRepository() {
        return universityStaffRepository;
    }



    public EmployeeServiceImpl(){
        this.universityStaffRepository = new UniversityStaffRepository();

    }
    @Override
    public UniversityStaffRepository createUniversityStaff(UniversityStaff employee) {
        return null;
    }

    @Override
    public List<UniversityStaff> getAllUniversityStaff() {
        return List.of();
    }

    @Override
    public UniversityStaff getEmpID(int EmpID) {
        return null;
    }

    @Override
    public void updateUniversityStaff(EmployeeDto employeeDto) {

    }

    @Override
    public void deleteUniversityStaff(int EmpID) throws ClassNotFoundException {

    }

    @Override
    public List<UniversityStaff> getAllEmployees() {
        return List.of();
    }

    public void setUniversityStaffRepository(UniversityStaffRepository universityStaffRepository) {
        this.universityStaffRepository = universityStaffRepository;
    }

    public  void updateEmployee(EmployeeDto employeeDto){

        UniversityStaff universityStaff = (UniversityStaff) universityStaffRepository.getEmployee(employeeDto.Emp_ID());
        if (!universityStaff.getEmpName().equals(employeeDto.Emp_Name()));{
            universityStaff.setEmpName(employeeDto.Emp_Name());
        }
        if(!universityStaff.getSalary()) {
            universityStaff.setSalary(employeeDto.Salary());
        }
        if(!universityStaff.getPhoneNumber().equals(employeeDto.phone_number())) {
            universityStaff.setPhoneNumber(employeeDto.phone_number());
        }
       universityStaffRepository.update(universityStaff);
}
}
