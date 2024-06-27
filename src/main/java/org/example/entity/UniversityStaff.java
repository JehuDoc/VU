package org.example.entity;

import java.math.BigDecimal;

public class UniversityStaff {
   private int EmpID;
   private String EmpName;
   private String DepartmentName;
   private int OfficeId;
   private BigDecimal Salary;
   private Long PhoneNumber;
   private String EmpPosition;

    public UniversityStaff() {

    }

    public String getEmpName() {
        return EmpName;
    }

    public int getEmpID() {
        return EmpID;
    }



    public void setEmpID(int empID) {
        EmpID = empID;
    }


    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public int getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(int officeId) {
        OfficeId = officeId;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(BigDecimal salary) {
        Salary = salary;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public Long setPhoneNumber(Long aLong) {
        Long phoneNumber = getPhoneNumber();
        return   PhoneNumber = phoneNumber;
    }

    public String getEmpPosition() {
        return EmpPosition;
    }

    public void setEmpPosition(String empPosition) {
        EmpPosition = empPosition;
    }

    public UniversityStaff(
            int Emp_ID,
            String Emp_Name,
            String Department_Name,
            int Office_id,
            BigDecimal Salary,
            Long phone_number,
            String Emp_position ){
       this.EmpID = Emp_ID;
       this.EmpName = Emp_Name;
       this.EmpPosition = Emp_position;
       this.Salary = Salary;
       this.OfficeId = Office_id;
       this.PhoneNumber = phone_number;
       this.DepartmentName = Department_Name;
   }
    public String toString() {
        return "UniversityStaff{" +
                "ID" + EmpID +
                "Name" + EmpName + '\'' +
                "Department" + DepartmentName + '\'' +
                "DepartmentManager" + OfficeId +
                "Salary" + Salary +
                "PhoneNumber" + PhoneNumber +
                "Position" + EmpPosition;

    }


}
