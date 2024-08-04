package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    static Connection connection = null;

    public static Connection openConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/LIBROSDB";
            String user = "root";
            String password = "Rlwl2023.";

            connection = DriverManager.getConnection(URL,user,password);

            System.out.println("Connection establish");

        } catch (ClassNotFoundException error) {
            throw new RuntimeException("ERROR: Driver not found" + error);
        } catch (SQLException error) {
            throw new RuntimeException("ERROR: Credential failed" + error);
        }
        return connection;
    }

    public static void closeConnection(){
        try {
            if(connection != null) connection.close();
            System.out.println("Connection closed");
        } catch (SQLException error) {
            System.out.println("ERROR: Connection not close");
        }
    }

}
