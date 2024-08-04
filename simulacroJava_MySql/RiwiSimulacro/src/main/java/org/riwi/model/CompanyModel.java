package org.riwi.model;

import org.riwi.entity.CompanyEntity;
import org.riwi.persistence.IModel.ICompanyModel;
import org.riwi.persistence.connection.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompanyModel implements ICompanyModel {
    Connection connection = null;
    @Override
    public CompanyEntity creation(CompanyEntity companyEntity) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "INSERT INTO COMPANY(NAME_COMPANY, LOCATION) VALUES(?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,companyEntity.getName_company());
            preparedStatement.setString(2, companyEntity.getLocation());

            boolean result = preparedStatement.execute();

            if(result){
                return companyEntity;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return null;
    }

    @Override
    public ArrayList<CompanyEntity> readAll() {
        connection = ConfigDB.openConnection();

        ArrayList<CompanyEntity> listCompany= new ArrayList<>();
        CompanyEntity company = new CompanyEntity();

        String sqlQuery = "SELECT * FROM COMPANY;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                company = new CompanyEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name_company"),
                        resultSet.getString("location")
                );
                listCompany.add(company);
            }
            preparedStatement.close();


        } catch (SQLException e) {
            throw new RuntimeException("Query failed" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return listCompany;
    }

    @Override
    public CompanyEntity readById(Integer id) {
        connection = ConfigDB.openConnection();
        String sqlQuery = "SELECT * FROM COMPANY WHERE ID = ?;";
        CompanyEntity company = new CompanyEntity();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                company = new CompanyEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("name_company"),
                        resultSet.getString("location")
                );
            }
            preparedStatement.close();
        }catch(SQLException error){
            throw new RuntimeException("Query failed" + error.getMessage());
        }
        ConfigDB.closeConnection();
        return company;
    }

    @Override
    public CompanyEntity update(CompanyEntity companyEntity, Integer id) {
        connection = ConfigDB.openConnection();

        String sqlQuery = "UPDATE COMPANY SET NAME_COMPANY = ? , LOCATION = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,companyEntity.getName_company());
            preparedStatement.setString(2, companyEntity.getLocation());
            preparedStatement.setInt(3, id);

            boolean result = preparedStatement.execute();

            if(result){
                return companyEntity;
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
        String sqlQuery = "DELETE FROM COMPANY WHERE ID = ?;";

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
