package org.riwi.model;

import org.riwi.entity.ClanEntity;
import org.riwi.entity.CompanyEntity;
import org.riwi.persistence.IModel.IClanModel;
import org.riwi.persistence.connection.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClanModel implements IClanModel {
    Connection connection = null;
    @Override
    public ClanEntity creation(ClanEntity clanEntity) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO CLAN(NAME_CLAN) VALUES(?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,clanEntity.getName_clan());

            boolean result = preparedStatement.execute();

            if(result){
                return clanEntity;
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
        String sqlQuery = "DELETE FROM CLAN WHERE ID = ?;";

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
    public ArrayList<ClanEntity> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<ClanEntity> listClan= new ArrayList<>();
        ClanEntity clanEntity = new ClanEntity();

        String sqlQuery = "SELECT * FROM CLAN;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                clanEntity = new ClanEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name_clan")
                );
                listClan.add(clanEntity);
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listClan;
    }

    @Override
    public ClanEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM CLAN WHERE ID = ?;";
        ClanEntity clanEntity = new ClanEntity();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                clanEntity = new ClanEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name_clan")
                );
            }
            preparedStatement.close();
        }catch(SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return clanEntity;
    }

    @Override
    public ClanEntity update(ClanEntity clanEntity, Integer id) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "UPDATE CLAN SET NAME_CLAN = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,clanEntity.getName_clan());
            preparedStatement.setInt(2,id);

            boolean result = preparedStatement.execute();

            if(result){
                return clanEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
