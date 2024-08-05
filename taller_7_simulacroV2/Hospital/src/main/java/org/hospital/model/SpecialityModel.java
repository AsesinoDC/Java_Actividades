package org.hospital.model;

import org.hospital.entity.SpecialtyEntity;
import org.hospital.persistence.IModel.ISpecialityModel;
import org.hospital.persistence.connection.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SpecialityModel implements ISpecialityModel {
    private Connection connection = null;

    @Override
    public SpecialtyEntity create(SpecialtyEntity specialtyEntity) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "INSERT INTO SPECIALITY (NAME,DESCRIPTION) VALUES(?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, specialtyEntity.getName());
            preparedStatement.setString(2, specialtyEntity.getDescription());

            boolean result = preparedStatement.execute();

            if(result){
                return specialtyEntity;
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
        String sqlQuery = "DELETE FROM SPECIALITY WHERE ID = ?;";

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
    public ArrayList<SpecialtyEntity> readAll() {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM SPECIALITY;";

        ArrayList<SpecialtyEntity> listSpeciality = new ArrayList<>();
        SpecialtyEntity specialtyEntity = new SpecialtyEntity();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                specialtyEntity = new SpecialtyEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description")
                );
                listSpeciality.add(specialtyEntity);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listSpeciality;
    }

    @Override
    public SpecialtyEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        SpecialtyEntity specialtyEntity = new SpecialtyEntity();

        String sqlQuery = "SELECT * FROM SPECIALITY WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            if(resultSet.next()){
                specialtyEntity = new SpecialtyEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e);
        }
        ConfigDB.closeConnection();
        return specialtyEntity;
    }

    @Override
    public SpecialtyEntity update(SpecialtyEntity specialtyEntity, Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "UPDATE SPECIALITY SET NAME = ?, DESCRIPTION = ? WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, specialtyEntity.getName());
            preparedStatement.setString(2, specialtyEntity.getDescription());
            preparedStatement.setInt(3,id);

            boolean result = preparedStatement.execute();

            if(result){
                return specialtyEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
