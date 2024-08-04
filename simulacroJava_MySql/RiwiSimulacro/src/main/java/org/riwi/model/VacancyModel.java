package org.riwi.model;

import org.riwi.entity.CoderEntity;
import org.riwi.entity.VacancyEntity;
import org.riwi.persistence.IModel.IVacancyModel;
import org.riwi.persistence.connection.ConfigDB;
import org.riwi.persistence.enums.CohortesEmun;
import org.riwi.persistence.enums.StatusContractingEnum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VacancyModel implements IVacancyModel {
    Connection connection = null;
    @Override
    public VacancyEntity creation(VacancyEntity vacancyEntity) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO VACANCY(ID_COMPANY,ID_CODER,TITLE_CODER,DESCRIPTION,ID_CLAN,STATUS) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,vacancyEntity.getId_company());
            preparedStatement.setInt(2,vacancyEntity.getId_coder());
            preparedStatement.setString(3,vacancyEntity.getTitle_coder());
            preparedStatement.setString(4,vacancyEntity.getDescription());
            preparedStatement.setInt(5,vacancyEntity.getId_clan());
            preparedStatement.setString(6, vacancyEntity.getStatus().name());


            boolean result = preparedStatement.execute();

            if(result){
                return vacancyEntity;
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
        String sqlQuery = "DELETE FROM VACANCY WHERE ID = ?;";

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
    public ArrayList<VacancyEntity> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<VacancyEntity> listVacancy= new ArrayList<>();
        VacancyEntity vacancyEntity = new VacancyEntity();

        String sqlQuery = "SELECT * FROM VACANCY;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                vacancyEntity = new VacancyEntity(
                        resultSet.getInt("id"),
                        resultSet.getInt("id_company"),
                        resultSet.getInt("id_coder"),
                        resultSet.getString("title_coder"),
                        resultSet.getString("description"),
                        resultSet.getInt("id_clan"),
                        StatusContractingEnum.valueOf(resultSet.getString("status"))

                );
                listVacancy.add(vacancyEntity);
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listVacancy;
    }

    @Override
    public VacancyEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM VACANCY WHERE ID = ?;";
        VacancyEntity vacancyEntity = new VacancyEntity();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                vacancyEntity = new VacancyEntity(
                        resultSet.getInt("id"),
                        resultSet.getInt("id_company"),
                        resultSet.getInt("id_coder"),
                        resultSet.getString("title_coder"),
                        resultSet.getString("description"),
                        resultSet.getInt("id_clan"),
                        StatusContractingEnum.valueOf(resultSet.getString("status"))

                );
            }
            preparedStatement.close();
        }catch(SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return vacancyEntity;
    }

    @Override
    public Integer searchById(Integer id, Integer option) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "";

        switch (option){
            case 0 ->{sqlQuery = "SELECT ID FROM COMPANY WHERE ID = ?";}

            case 1 ->{sqlQuery = "SELECT ID FROM CODER WHERE ID = ?";}

            case 2 ->{sqlQuery = "SELECT ID FROM CLAN WHERE ID = ?";}
        }

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
    public VacancyEntity update(VacancyEntity vacancyEntity, Integer id) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "UPDATE VACANCY SET ID_COMPANY = ? , ID_CODER = ?, TITLE_CODER = ?, DESCRIPTION = ?, ID_CLAN = ?, STATUS = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,vacancyEntity.getId_company());
            preparedStatement.setInt(2,vacancyEntity.getId_coder());
            preparedStatement.setString(3,vacancyEntity.getTitle_coder());
            preparedStatement.setString(4,vacancyEntity.getDescription());
            preparedStatement.setInt(5,vacancyEntity.getId_clan());
            preparedStatement.setString(6, vacancyEntity.getStatus().name());
            preparedStatement.setInt(7, id);


            boolean result = preparedStatement.execute();

            if(result){
                return vacancyEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
