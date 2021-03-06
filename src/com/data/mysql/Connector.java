package com.data.mysql;

import java.sql.*;

public class Connector {

    private final String url = "jdbc:mysql://localhost/event_manager";
    private final String user = "root";
    private final String password = "";
    public Connection connection;

    public Connection connect() {
        try {
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);
            return this.connection;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        return this.connection;
    }

    public void disconnect() {
        try {
            if (this.connection != null) {
                this.connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
