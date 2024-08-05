package org.hospital.model;

import org.hospital.entity.QuoteEntity;
import org.hospital.persistence.IModel.IQuoteModel;
import org.hospital.persistence.connection.ConfigDB;

import java.sql.*;
import java.util.ArrayList;

public class QuoteModel implements IQuoteModel {
    private Connection connection = null;

    @Override
    public QuoteEntity create(QuoteEntity quoteEntity) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "INSERT INTO QUOTE (ID_PATIENT,ID_MEDICO,QUOTE_DATE,QUOTE_HOUR,MOTIVE) VALUES(?,?,?,?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setInt(1, quoteEntity.getId_patient());
            preparedStatement.setInt(2, quoteEntity.getId_medico());
            preparedStatement.setDate(3, java.sql.Date.valueOf(quoteEntity.getQuote_date()));
            preparedStatement.setTime(4, Time.valueOf(quoteEntity.getQuote_hour()));
            preparedStatement.setString(5, quoteEntity.getMotive());

            boolean result = preparedStatement.execute();

            if(result){
                return quoteEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "DELETE FROM QUOTE WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,id);

            int result = preparedStatement.executeUpdate();

            if(result == 1){
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return false;
    }

    @Override
    public ArrayList<QuoteEntity> readAll() {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM QUOTE;";

        ArrayList<QuoteEntity> listQuote = new ArrayList<>();
        QuoteEntity quoteEntity = new QuoteEntity();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                quoteEntity = new QuoteEntity(
                        resultSet.getInt("id"),
                        resultSet.getInt("id_patient"),
                        resultSet.getInt("id_medico"),
                        resultSet.getString("quote_date"),
                        resultSet.getString("quote_hour"),
                        resultSet.getString("motive")
                );
                listQuote.add(quoteEntity);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listQuote;
    }

    @Override
    public QuoteEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        QuoteEntity quoteEntity = new QuoteEntity();

        String sqlQuery = "SELECT * FROM QUOTE WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            if(resultSet.next()){
                quoteEntity = new QuoteEntity(
                        resultSet.getInt("id"),
                        resultSet.getInt("id_patient"),
                        resultSet.getInt("id_medico"),
                        resultSet.getString("quote_date"),
                        resultSet.getString("quote_hour"),
                        resultSet.getString("motive")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e);
        }
        ConfigDB.closeConnection();
        return quoteEntity;
    }

    @Override
    public Integer searchById(Integer id, Integer option) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "";

        switch (option){
            case 0 -> {sqlQuery = "SELECT ID FROM PATIENT WHERE ID = ?;";}

            case 1 -> {sqlQuery = "SELECT ID FROM MEDICO WHERE ID = ?;";}
        }

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet result = preparedStatement.getResultSet();

            if (result.next()){
                int id_found = result.getInt("id");
                return id_found;
            }


        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public QuoteEntity update(QuoteEntity quoteEntity, Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "UPDATE QUOTE SET ID_PATIENT = ?, ID_MEDICO = ?, QUOTE_DATE = ?, QUOTE_HOUR = ?, MOTIVE = ? WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, quoteEntity.getId_patient());
            preparedStatement.setInt(2, quoteEntity.getId_medico());
            preparedStatement.setDate(3, java.sql.Date.valueOf(quoteEntity.getQuote_date()));
            preparedStatement.setTime(4, Time.valueOf(quoteEntity.getQuote_hour()));
            preparedStatement.setString(5, quoteEntity.getMotive());
            preparedStatement.setInt(6,id);

            boolean result = preparedStatement.execute();

            if(result){
                return quoteEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
