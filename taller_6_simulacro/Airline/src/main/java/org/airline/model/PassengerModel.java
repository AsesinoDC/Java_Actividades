package org.airline.model;

import org.airline.entity.Airplane;
import org.airline.entity.Passenger;
import org.airline.persistence.IModel.IPassengerModel;
import org.airline.persistence.connection.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PassengerModel implements IPassengerModel {
    Connection connection = null;
    @Override
    public Passenger creation(Passenger passenger)  {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO PASSENGER(NAME,LAST_NAME,DOCUMENT_IDENTITY) VALUES(?,?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1,passenger.getName());
            preparedStatement.setString(2,passenger.getLast_name());
            preparedStatement.setString(3,passenger.getDocument_identity());

            boolean result = preparedStatement.execute();

            if (result){
                return passenger;
            }
            preparedStatement.close();

        }catch (SQLException error){
            throw new RuntimeException("Query failed " + error.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public ArrayList<Passenger> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<Passenger> listPassengers= new ArrayList<>();
        Passenger passenger = new Passenger();

        String sqlQuery = "SELECT * FROM PASSENGER;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                passenger = new Passenger(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("document_identity")
                );
                listPassengers.add(passenger);
            }
            preparedStatement.close();


        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listPassengers;
    }

    @Override
    public Passenger readById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM PASSENGER WHERE ID = ?;";
        Passenger passenger = new Passenger();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                passenger = new Passenger(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("document_identity")
                );
            }
            preparedStatement.close();

        }catch(SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return passenger;
    }

    @Override
    public Passenger update(Passenger passenger, Integer id) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "UPDATE PASSENGER SET NAME = ?, LAST_NAME = ?, DOCUMENT_IDENTITY = ? WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1,passenger.getName());
            preparedStatement.setString(2,passenger.getLast_name());
            preparedStatement.setString(3,passenger.getDocument_identity());
            preparedStatement.setInt(4,id);

            boolean result = preparedStatement.execute();

            if (result){
                return passenger;
            }
            preparedStatement.close();

        }catch (SQLException error){
            throw new RuntimeException("Query failed " + error.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "DELETE FROM PASSENGER WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            boolean result = preparedStatement.execute();

            if(result){
                return true;
            }
            preparedStatement.close();

        }catch (SQLException error){
            throw new RuntimeException("Query failed " + error.getMessage());
        }
        ConfigDB.closeConnection();
        return false;
    }
}
