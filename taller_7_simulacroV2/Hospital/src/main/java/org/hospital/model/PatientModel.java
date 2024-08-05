package org.hospital.model;

import org.hospital.entity.MedicoEntity;
import org.hospital.entity.PatientEntity;
import org.hospital.persistence.IModel.IPatientModel;
import org.hospital.persistence.connection.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PatientModel implements IPatientModel {
    private Connection connection = null;

    @Override
    public PatientEntity create(PatientEntity patientEntity) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "INSERT INTO PATIENT (NAME,LAST_NAME,BIRTH_DATE,IDENTITY_DOCUMENT) VALUES(?,?,?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, patientEntity.getName());
            preparedStatement.setString(2, patientEntity.getLast_name());
            preparedStatement.setDate(3, java.sql.Date.valueOf(patientEntity.getBirth_date()));
            preparedStatement.setString(4, patientEntity.getIdentity_document());

            boolean result = preparedStatement.execute();

            if(result){
                return patientEntity;
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
        String sqlQuery = "DELETE FROM PATIENT WHERE ID = ?;";

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
    public ArrayList<PatientEntity> readAll() {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM PATIENT;";

        ArrayList<PatientEntity> listPatient = new ArrayList<>();
        PatientEntity patientEntity = new PatientEntity();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                patientEntity = new PatientEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("birth_date"),
                        resultSet.getString("identity_document")
                );
                listPatient.add(patientEntity);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listPatient;
    }

    @Override
    public PatientEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        PatientEntity patientEntity = new PatientEntity();

        String sqlQuery = "SELECT * FROM PATIENT WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            if(resultSet.next()){
                patientEntity = new PatientEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("birth_date"),
                        resultSet.getString("identity_document")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e);
        }
        ConfigDB.closeConnection();
        return patientEntity;
    }

    @Override
    public PatientEntity update(PatientEntity patientEntity, Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "UPDATE PATIENT SET NAME = ?, LAST_NAME = ?, BIRTH_DATE = ?, IDENTITY_DOCUMENT = ? WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, patientEntity.getName());
            preparedStatement.setString(2, patientEntity.getLast_name());
            preparedStatement.setDate(3, java.sql.Date.valueOf(patientEntity.getBirth_date()));
            preparedStatement.setString(4, patientEntity.getIdentity_document());
            preparedStatement.setInt(5, id);

            boolean result = preparedStatement.execute();

            if(result){
                return patientEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
