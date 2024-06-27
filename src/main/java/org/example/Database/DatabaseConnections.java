package org.example.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnections<ResulSet> implements AutoCloseable {

    private static Connection connection;

    static {

        try {
            String url = "jdbc:mysql://localhost:3306/School_Staff";
            String username = "root";
            String password = "Topcoder1995!";

            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public static Connection getConnection() {
        return connection;
    }

    @Override
    public void close() throws Exception {

    }
}