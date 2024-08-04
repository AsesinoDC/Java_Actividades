package org.riwi.entity;

import org.riwi.persistence.enums.StatusContractingEnum;

public class VacancyEntity {
    private int id;
    private int id_company;
    private int id_coder;
    private String title_coder;
    private String description;
    private int id_clan;
    private StatusContractingEnum status;

    public VacancyEntity() {}

    public VacancyEntity(int id_company, int id_coder,
                         String title_coder, String description, int id_clan, StatusContractingEnum status) {
        this.id_company = id_company;
        this.id_coder = id_coder;
        this.title_coder = title_coder;
        this.description = description;
        this.id_clan = id_clan;
        this.status = status;
    }

    public VacancyEntity(int id, int id_company, int id_coder, String title_coder, String description, int id_clan, StatusContractingEnum status) {
        this.id = id;
        this.id_company = id_company;
        this.id_coder = id_coder;
        this.title_coder = title_coder;
        this.description = description;
        this.id_clan = id_clan;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getId_company() {
        return this.id_company;
    }

    public int getId_coder() {
        return this.id_coder;
    }

    public String getTitle_coder() {
        return this.title_coder;
    }

    public String getDescription() {
        return this.description;
    }

    public int getId_clan() {
        return this.id_clan;
    }

    public StatusContractingEnum getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public void setId_coder(int id_coder) {
        this.id_coder = id_coder;
    }

    public void setTitle_coder(String title_coder) {
        this.title_coder = title_coder;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId_clan(int id_clan) {
        this.id_clan = id_clan;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "id: " + this.id +" | " +
                ", id_company: " + this.id_company + " | " +
                ", id_coder: " + this.id_coder + " | " +
                ", title_coder: " + this.title_coder + " | " +
                ", description: " + this.description + " | " +
                ", id_clan: " + this.id_clan + " | " +
                ", status: " + this.status +
                '}' +  "\n" + "\n";
    }
}
