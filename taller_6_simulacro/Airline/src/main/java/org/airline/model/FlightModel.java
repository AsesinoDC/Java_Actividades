package org.airline.model;

import org.airline.entity.Airplane;
import org.airline.entity.Flight;
import org.airline.persistence.IModel.IFlightModel;
import org.airline.persistence.connection.ConfigDB;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class FlightModel implements IFlightModel {

    Connection connection = null;

    @Override
    public Flight creation(Flight flight) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO FLIGHT(DESTINATION,DEPARTURE_DATE,DEPARTURE_HOUR,ID_AIRPLANE) VALUES(?,?,?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);


            preparedStatement.setString(1,flight.getDestination());
            preparedStatement.setDate(2, java.sql.Date.valueOf(flight.getDeparture_date()));
            preparedStatement.setTime(3, Time.valueOf(flight.getDeparture_time()));
            preparedStatement.setInt(4,flight.getAirplane());

            boolean result = preparedStatement.execute();

            if (result){
                JOptionPane.showMessageDialog(null, flight.toString() + "\n Creado exitosamente");
                return flight;
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
        String sqlQuery = "DELETE FROM FLIGHT WHERE ID = ?;";

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

    @Override
    public ArrayList<Flight> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<Flight> listFlight = new ArrayList<>();
        Flight flight = new Flight();

        String sqlQuery = "SELECT * FROM FLIGHT;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                flight = new Flight(
                        resultSet.getInt("id"),
                        resultSet.getString("destination"),
                        resultSet.getString("departure_date"),
                        resultSet.getString("departure_hour"),
                        resultSet.getInt("id_airplane")
                );
                listFlight.add(flight);
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listFlight;
    }

    @Override
    public Flight readById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM FLIGHT WHERE ID = ?;";
        Flight flight = new Flight();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                flight = new Flight(
                        resultSet.getInt("id"),
                        resultSet.getString("destination"),
                        resultSet.getString("departure_date"),
                        resultSet.getString("departure_hour"),
                        resultSet.getInt("id_airplane")
                );
            }
            preparedStatement.close();
        }catch(SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return flight;
    }

    @Override
    public Flight update(Flight flight, Integer id) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "UPDATE FLIGHT SET DESTINATION = ? ,DEPARTURE_DATE = ?, DEPARTURE_HOUR = ? ,ID_AIRPLANE = ? WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);


            preparedStatement.setString(1,flight.getDestination());
            preparedStatement.setDate(2, java.sql.Date.valueOf(flight.getDeparture_date()));
            preparedStatement.setTime(3, Time.valueOf(flight.getDeparture_time()));
            preparedStatement.setInt(4,flight.getAirplane());
            preparedStatement.setInt(5,id);

            boolean result = preparedStatement.execute();

            if (result){

                return flight;
            }
            preparedStatement.close();

        }catch (SQLException error){
            throw new RuntimeException("Query failed " + error.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public Integer searchById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT ID FROM AIRPLANE WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();
            ResultSet result = preparedStatement.getResultSet();

            if(result.next()){
                int idFound = result.getInt("ID");
                return idFound;
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Query failed " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
