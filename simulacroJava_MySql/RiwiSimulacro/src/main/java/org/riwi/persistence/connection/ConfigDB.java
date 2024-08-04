package org.riwi.persistence.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    static Connection connection = null;

    public static Connection openConnection(){

        String URL = "jdbc:mysql://localhost:3306/RIWI";
        String user = "root";
        String password = "Bombom100";

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
                if (error.getErrorCode() == 1062) {
                    System.out.println("Error: El documento ya existe.");
                } else {
                    error.printStackTrace();
                }
                throw new RuntimeException("Connection is not close" + error.getMessage());
            }
        }
    }

}
