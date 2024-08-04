package org.riwi.entity;

import java.sql.Date;

public class CompanyEntity {
    private int id;

    private String name_company;
    private String location;

    public CompanyEntity(){}

    public CompanyEntity(String name_company, String location) {
        this.name_company = name_company;
        this.location = location;
    }

    public CompanyEntity(int id,String name_company, String location) {
        this.id = id;
        this.name_company = name_company;
        this.location = location;
    }



    public int getId() {
        return this.id;
    }

    public String getName_company() {
        return this.name_company;
    }

    public String getLocation() {
        return this.location;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id: " + this.id + " | " +
                ", name_company: " + this.name_company + " | " +
                ", location: " + this.location +
                '}' +  "\n" + "\n";
    }
}
