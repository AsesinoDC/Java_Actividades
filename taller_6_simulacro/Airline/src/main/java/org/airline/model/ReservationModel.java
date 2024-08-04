package org.airline.model;

import org.airline.entity.Flight;
import org.airline.entity.Reservation;
import org.airline.persistence.IModel.IReservationModel;
import org.airline.persistence.connection.ConfigDB;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class ReservationModel implements IReservationModel {

    Connection connection = null;
    @Override
    public Reservation creation(Reservation reservation) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO RESERVATION(ID_PASSENGER,ID_FLIGHT,RESERVATION_DATE,SEAT) VALUES(?,?,?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);


            preparedStatement.setInt(1,reservation.getId_passenger());
            preparedStatement.setInt(2, reservation.getId_flight());
            preparedStatement.setDate(3, java.sql.Date.valueOf(reservation.getReservation_date()));
            preparedStatement.setString(4, reservation.getSeat());

            boolean result = preparedStatement.execute();

            if (result){
                return reservation;
            }

            preparedStatement.close();

        }catch (SQLException error){
            throw new RuntimeException("Query failed " + error.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public ArrayList<Reservation> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<Reservation> listReservation = new ArrayList<>();
        Reservation reservation = new Reservation();

        String sqlQuery = "SELECT * FROM FLIGHT;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                reservation = new Reservation(
                        resultSet.getInt("id"),
                        resultSet.getInt("id_passenger"),
                        resultSet.getString("departure_hour"),
                        resultSet.getString("seat")
                );
                listReservation.add(reservation);
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listReservation;
    }

    @Override
    public Reservation readById(Integer id) {
        connection = ConfigDB.openConnection();

        Reservation reservation = new Reservation();

        String sqlQuery = "SELECT * FROM RESERVATION WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                reservation = new Reservation(
                        resultSet.getInt("id"),
                        resultSet.getInt("id_passenger"),
                        resultSet.getString("departure_hour"),
                        resultSet.getString("seat")
                );
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return reservation;
    }

    @Override
    public Reservation update(Reservation reservation, Integer integer) {
        return null;
    }

    @Override
    public Boolean delete(Integer integer) {
        return null;
    }

    @Override
    public Integer searchById(Integer integer) {
        return null;
    }

}
