package org.hospital.persistence.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    static Connection connection = null;

    public static Connection openConnection(){
        String URL = "jdbc:mysql://localhost:3306/HOSPITAL";
        String user = "root";
        String password = "";

        try{
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connection successful");

        } catch (SQLException e) {
            throw new RuntimeException("Failed connection: " + e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        if(connection != null){
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}
