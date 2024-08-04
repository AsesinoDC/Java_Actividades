package org.riwi.model;

import org.riwi.entity.ContractingEntity;
import org.riwi.persistence.IModel.IContractingModel;
import org.riwi.persistence.connection.ConfigDB;
import org.riwi.persistence.enums.StatusContractingEnum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContractingModel implements IContractingModel {
    Connection connection = null;
    @Override
    public ContractingEntity creation(ContractingEntity contractingEntity) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO CONTRACTING(ID_VACANCY,STATUS,SALARY) VALUES(?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,contractingEntity.getId_vacancy());
            preparedStatement.setString(2,contractingEntity.getStatus().name());
            preparedStatement.setInt(3,contractingEntity.getSalary());


            boolean result = preparedStatement.execute();

            if(result){
                return contractingEntity;
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
        String sqlQuery = "DELETE FROM CONTRACTING WHERE ID = ?;";

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
    public ArrayList<ContractingEntity> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<ContractingEntity> listContracting= new ArrayList<>();
        ContractingEntity contractingEntity = new ContractingEntity();

        String sqlQuery = "SELECT * FROM CONTRACTING;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                contractingEntity = new ContractingEntity(
                        resultSet.getInt("id"),
                        resultSet.getDate("aplication_date"),
                        resultSet.getInt("id_vacancy"),
                        StatusContractingEnum.valueOf(resultSet.getString("status")),
                        resultSet.getInt("salary")

                );
                listContracting.add(contractingEntity);
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listContracting;
    }

    @Override
    public ContractingEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM CONTRACTING WHERE ID = ?;";
        ContractingEntity contractingEntity = new ContractingEntity();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                contractingEntity = new ContractingEntity(
                        resultSet.getInt("id"),
                        resultSet.getDate("aplication_date"),
                        resultSet.getInt("id_vacancy"),
                        StatusContractingEnum.valueOf(resultSet.getString("status")),
                        resultSet.getInt("salary")
                );
            }
            preparedStatement.close();
        }catch(SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return contractingEntity;
    }

    @Override
    public Integer searchById(Integer id, Integer option) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT ID FROM VACANCY WHERE ID = ?";

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
    public ContractingEntity update(ContractingEntity contractingEntity, Integer id) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "UPDATE CONTRACTING SET ID_VACANCY = ?, STATUS = ?, SALARY = ? WHERE ID = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,contractingEntity.getId_vacancy());
            preparedStatement.setString(2,contractingEntity.getStatus().name());
            preparedStatement.setInt(3,contractingEntity.getSalary());
            preparedStatement.setInt(4,id);


            boolean result = preparedStatement.execute();

            if(result){
                return contractingEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }
}
