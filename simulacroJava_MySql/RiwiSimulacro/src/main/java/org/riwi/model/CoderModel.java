package org.riwi.model;

import org.riwi.entity.ClanEntity;
import org.riwi.entity.CoderEntity;
import org.riwi.persistence.IModel.ICoderModel;
import org.riwi.persistence.connection.ConfigDB;
import org.riwi.persistence.enums.CohortesEmun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CoderModel implements ICoderModel {

    Connection connection = null;
    @Override
    public CoderEntity creation(CoderEntity coderEntity) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO CODER(NAME,LAST_NAME,IDENTITY_DOCUMENT,TECHNOLOGY,COHORTE,ID_CLAN) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,coderEntity.getName());
            preparedStatement.setString(2,coderEntity.getLast_name());
            preparedStatement.setString(3,coderEntity.getIdentity_document());
            preparedStatement.setString(4,coderEntity.getTechnology());
            preparedStatement.setString(5,coderEntity.getCohorte().name());
            preparedStatement.setInt(6,coderEntity.getId_clan());


            boolean result = preparedStatement.execute();

            if(result){
                return coderEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "DELETE FROM CODER WHERE ID = ?;";

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

    @Override
    public ArrayList<CoderEntity> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<CoderEntity> listClan= new ArrayList<>();
        CoderEntity coderEntity = new CoderEntity();

        String sqlQuery = "SELECT * FROM CODER;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                coderEntity = new CoderEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("IDENTITY_DOCUMENT"),
                        resultSet.getString("TECHNOLOGY"),
                        CohortesEmun.valueOf(resultSet.getString("cohorte")),
                        resultSet.getInt("id_clan")

                );
                listClan.add(coderEntity);
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listClan;
    }

    @Override
    public CoderEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM CODER WHERE ID = ?;";
        CoderEntity coderEntity = new CoderEntity();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                coderEntity = new CoderEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("IDENTITY_DOCUMENT"),
                        resultSet.getString("TECHNOLOGY"),
                        CohortesEmun.valueOf(resultSet.getString("cohorte")),
                        resultSet.getInt("id_clan")

                );
            }
            preparedStatement.close();
        }catch(SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return coderEntity;
    }

    @Override
    public Integer searchById(Integer id, Integer option) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT ID FROM CLAN WHERE ID = ?";

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

    @Override
    public CoderEntity update(CoderEntity coderEntity, Integer id) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "UPDATE CODER SET NAME = ?, LAST_NAME = ?, IDENTITY_DOCUMENT = ? , TECHNOLOGY = ? , COHORTE = ?, ID_CLAN = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,coderEntity.getName());
            preparedStatement.setString(2,coderEntity.getLast_name());
            preparedStatement.setString(3,coderEntity.getIdentity_document());
            preparedStatement.setString(4,coderEntity.getTechnology());
            preparedStatement.setString(5,coderEntity.getCohorte().name());
            preparedStatement.setInt(6,coderEntity.getId_clan());
            preparedStatement.setInt(7,id);


            boolean result = preparedStatement.execute();

            if(result){
                return coderEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
