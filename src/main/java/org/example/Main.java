package org.example;

import org.example.Database.DatabaseConnections;
import org.example.dto.EmployeeDto;
import org.example.entity.UniversityStaff;
import org.example.repository.UniversityStaffRepository;
import org.example.service.EmployeeService;
import org.example.service.EmployeeServiceImpl;

import java.math.BigDecimal;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException {
        try {
            if (DatabaseConnections.getConnection().isValid(30)) {
                System.out.println("DATABASE CONNECTED");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        UniversityStaffRepository universityStaffRepository = new UniversityStaffRepository();
        Scanner scanner = new Scanner(System.in);
        int input;

        EmployeeService employeeService = new EmployeeServiceImpl();

        while (true) {
            System.out.println("""
                    Welcome to the University Staff Management System!!!
                    the following options are available.
                    1) Create New Employee
                    2) Get All Employees
                    3) Get Employees By ID
                    4) Update an Employee
                    5) Delete an Employee
                    6) Exit
                    """);
            input = scanner.nextInt();
            switch (input){
                case 1:
                    UniversityStaff employee = new UniversityStaff();
                    scanner.nextLine();
                    System.out.println("Please enter first name");
                    employee.setEmpName(scanner.nextLine());
                    System.out.println("Please enter ID");
                    employee.setEmpID(scanner.nextInt());
                    System.out.println("Please enter starting salary");
                    employee.setSalary(new BigDecimal(scanner.next()));
                    System.out.println("Please enter phone number");
                    employee.setPhoneNumber(scanner.nextLong());
                    employeeService.createUniversityStaff(employee);
                    break;
                case 2:
                    List<UniversityStaff> employees = employeeService.getAllEmployees();
                    employees.forEach(System.out::println);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Please enter employee id");
                    employee = employeeService.getEmpID(scanner.nextInt());
                    System.out.println(employee);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Please enter employee id");
                    employee = employeeService.getEmpID(scanner.nextInt());
                    System.out.println("Would you like to change the first name? (Yes/No)");
                    scanner.nextLine();
                    String yN = scanner.nextLine(), newName = "Name", newSalary = "Yearly Salary";
                    Long newPhone = 0l;
                    if(yN.equalsIgnoreCase("yes")) {
                        newName = scanner.nextLine();
                    } else if (yN.equalsIgnoreCase("no")) {
                        newName = employee.getEmpName();
                    }

                    System.out.println("Would you like to change the salary? (Yes/No)");
                    yN = scanner.nextLine();
                    if(yN.equalsIgnoreCase("yes")) {
                     BigDecimal   Salary = BigDecimal.valueOf(Long.parseLong(scanner.next()));
                    } else if (yN.equalsIgnoreCase("no")) {
                       BigDecimal Salary = BigDecimal.valueOf(employee.getSalary());
                    }
                    System.out.println("Would you like to change the phone? (Yes/No)");
                    yN = scanner.nextLine();
                    if(yN.equalsIgnoreCase("yes")) {
                       Long Phone = scanner.nextLong();
                    } else if (yN.equalsIgnoreCase("no")) {
                       Long Phone = employee.getPhoneNumber();
                    }

                    int PhoneNumber = 0;
                    String Salary = String.valueOf(BigDecimal.valueOf(Long.parseUnsignedLong(newSalary)));
                    employeeService.updateUniversityStaff(
                            new EmployeeDto ( employee.getEmpID(),
                    employee.getEmpName(),
                    employee.getEmpPosition();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Please enter employee id");
                    employeeService.deleteUniversityStaff(scanner.nextInt());
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please enter a number 1-6 to make a selection!");
                    break;
            }
        }
    }


}