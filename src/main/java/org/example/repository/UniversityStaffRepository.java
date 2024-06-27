package org.example.repository;

import org.example.Database.DatabaseConnections;
import org.example.entity.UniversityStaff;

import java.sql.*;
import java.util.List;

public class UniversityStaffRepository {

    private Connection connection;

    public UniversityStaffRepository(){
        connection = DatabaseConnections.getConnection();
    }
    public UniversityStaff save(UniversityStaff universityStaff) {
        String sql = "Insert Into employee(Emp_ID, Emp_Name, Office_ID, Phone_Number, Emp_Position, Salary, Department_Name) VALUE (?,?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, universityStaff.getEmpName());
            statement.setString(2, universityStaff.getDepartmentName());
            statement.setBigDecimal(3, universityStaff.getSalary());
            statement.setLong(4, universityStaff.getPhoneNumber());
            statement.setInt(5, universityStaff.getOfficeId());
            statement.setInt(6, universityStaff.getEmpID());
            statement.setString(7, universityStaff.getEmpPosition());
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
           return universityStaff;

    }

    public List<UniversityStaff> findAll(int i) throws SQLException {
        return null;
    }


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void getEmpID(int i) {
    }

    public Object getEmployee(int i) {
        String sql = "Select * from employee where Emp_ID = ?";
        return null;
    }


    public void update(UniversityStaff universityStaff) {
    }
}

