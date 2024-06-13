package com.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public Connection createConnection() {
        try {
            return DriverManager.getConnection("URL");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console: " + e.getMessage());
            return null;
        }
    }
}
