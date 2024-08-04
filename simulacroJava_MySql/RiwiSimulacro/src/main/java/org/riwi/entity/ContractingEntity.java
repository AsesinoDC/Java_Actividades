package org.riwi.entity;

import org.riwi.persistence.enums.StatusContractingEnum;

import java.sql.Date;

public class ContractingEntity {
    private int id;

    private Date application_date;
    private int id_vacancy;
    private StatusContractingEnum status;
    private int salary;

    public ContractingEntity(){}


    public ContractingEntity(int id_vacancy, StatusContractingEnum status, int salary) {
        this.id_vacancy = id_vacancy;
        this.status = status;
        this.salary = salary;
    }

    public ContractingEntity(int id, Date application_date, int id_vacancy, StatusContractingEnum status, int salary) {
        this.id = id;
        this.application_date = application_date;
        this.id_vacancy = id_vacancy;
        this.status = status;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public int getId_vacancy() {
        return this.id_vacancy;
    }

    public StatusContractingEnum getStatus() {
        return this.status;
    }

    public int getSalary() {
        return this.salary;
    }

    public Date getApplication_date() {
        return this.application_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_vacancy(int id_vacancy) {
        this.id_vacancy = id_vacancy;
    }

    public void setStatus(StatusContractingEnum status) {
        this.status = status;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Contracting{" +
            "id: " + this.id + " | " +
                ", aplication_date: " + this.application_date + " | " +
                ", id_vacancy: " + this.id_vacancy + " | " +
                ", status: " + this.status + " | " +
                ", salary: " + this.salary +
                '}' +  "\n" + "\n";
    }
}
