package org.airline.model;

import org.airline.entity.Airplane;
import org.airline.persistence.IModel.IAirplaneModel;
import org.airline.persistence.connection.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AirplaneModel implements IAirplaneModel {

    Connection connection = null;

    @Override
    public Airplane creation(Airplane airplane) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO AIRPLANE(MODEL,CAPACITY) VALUES(?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1,airplane.getModel());
            preparedStatement.setInt(2,airplane.getCapacity());

            boolean result = preparedStatement.execute();

            if (result){
                return airplane;
            }
            preparedStatement.close();

        }catch (SQLException error){
            throw new RuntimeException("Query failed " + error.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public ArrayList<Airplane> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<Airplane> listAirplane= new ArrayList<>();
        Airplane airplane = new Airplane();

        String sqlQuery = "SELECT * FROM AIRPLANE;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                airplane = new Airplane(
                        resultSet.getInt("id"),
                        resultSet.getString("model"),
                        resultSet.getInt("capacity")
                );
                listAirplane.add(airplane);
            }
            preparedStatement.close();


        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listAirplane;
    }

    @Override
    public Airplane readById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM AIRPLANE WHERE ID = ?;";
        Airplane airplane = new Airplane();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                airplane = new Airplane(
                        resultSet.getInt("id"),
                        resultSet.getString("model"),
                        resultSet.getInt("capacity")
                );
            }
            preparedStatement.close();
        }catch(SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return airplane;
    }
    @Override
    public Airplane update(Airplane airplane, Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "UPDATE AIRPLANE SET MODEL = ?, CAPACITY = ? WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,airplane.getModel());
            preparedStatement.setInt(2, airplane.getCapacity());
            preparedStatement.setInt(3, id);

            int result = preparedStatement.executeUpdate();

            if(result == 1){
                return airplane;
            }
            preparedStatement.close();

        }catch (SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
    @Override
    public Boolean delete(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "DELETE FROM AIRPLANE WHERE ID = ?;";

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
        return false;
    }

}
