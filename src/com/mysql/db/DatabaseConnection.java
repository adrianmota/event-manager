package com.mysql.db;

import java.sql.*;

public class DatabaseConnection {

    private final String url = "jdbc:mysql://localhost/proyecto_final_prog1";
    private final String user = "root";
    private final String password = "";
    public Connection connection;

    public void connect() {
        try {
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (this.connection != null) {
                this.connection.close();
            }
            System.out.println("Disconnected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
