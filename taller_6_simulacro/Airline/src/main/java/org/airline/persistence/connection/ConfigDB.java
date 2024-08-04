package org.airline.persistence.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    static Connection connection = null;

    public static Connection openConnection(){

        String URL = "jdbc:mysql://localhost:3306/AIROLINE";
        String user = "root";
        String password = "Rlwl2023.";

        try{
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connection successful");
        }catch (SQLException error){
            throw new RuntimeException("Driver failed " + error.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        if(connection != null){
            try {
                connection.close();
                System.out.println("Connection closed");
            }catch (SQLException error){
                throw new RuntimeException("Connection is not close" + error.getMessage());
            }
        }
    }

}
