package org.hospital.model;

import org.hospital.entity.MedicoEntity;
import org.hospital.entity.SpecialtyEntity;
import org.hospital.persistence.IModel.IMedicoModel;
import org.hospital.persistence.connection.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicoModel implements IMedicoModel {
    private Connection connection = null;


    @Override
    public MedicoEntity create(MedicoEntity medicoEntity) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "INSERT INTO MEDICO (NAME,LAST_NAME,ID_SPECIALITY) VALUES(?,?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, medicoEntity.getName());
            preparedStatement.setString(2, medicoEntity.getLast_name());
            preparedStatement.setInt(3, medicoEntity.getId_specialty());

            boolean result = preparedStatement.execute();

            if(result){
                return medicoEntity;
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
        String sqlQuery = "DELETE FROM MEDICO WHERE ID = ?;";

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
    public ArrayList<MedicoEntity> readAll() {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM MEDICO;";

        ArrayList<MedicoEntity> listMedico = new ArrayList<>();
        MedicoEntity medicoEntity = new MedicoEntity();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                medicoEntity = new MedicoEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("id_speciality")
                );
                listMedico.add(medicoEntity);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listMedico;
    }

    @Override
    public MedicoEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        MedicoEntity medicoEntity = new MedicoEntity();

        String sqlQuery = "SELECT * FROM MEDICO WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            if(resultSet.next()){
                medicoEntity = new MedicoEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("id_speciality")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e);
        }
        ConfigDB.closeConnection();
        return medicoEntity;
    }

    @Override
    public Integer searchById(Integer id, Integer option) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT ID FROM SPECIALITY WHERE ID = ?;";

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
    public MedicoEntity update(MedicoEntity medicoEntity, Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "UPDATE MEDICO SET NAME = ?, LAST_NAME = ?, ID_SPECIALITY = ? WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, medicoEntity.getName());
            preparedStatement.setString(2, medicoEntity.getLast_name());
            preparedStatement.setInt(3, medicoEntity.getId_specialty());
            preparedStatement.setInt(4, id);

            boolean result = preparedStatement.execute();

            if(result){
                return medicoEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
