package org.hospital.entity;

public class PatientEntity {
    private int id;
    private String name;
    private String last_name;
    private String birth_date;
    private String identity_document;

    public PatientEntity() {}

    public PatientEntity(String name, String last_name, String birth_date, String identity_document) {
        this.name = name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.identity_document = identity_document;
    }

    public PatientEntity(int id, String name, String last_name, String birth_date, String identity_document) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.identity_document = identity_document;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public String getBirth_date() {
        return this.birth_date;
    }

    public String getIdentity_document() {
        return this.identity_document;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setIdentity_document(String identity_document) {
        this.identity_document = identity_document;
    }

    @Override
    public String toString() {
        return "PatientEntity{" +
                "id: " + this.id + " | " +
                ", name: " + this.name + " | " +
                ", last_name: " + this.last_name + " | " +
                ", birth_date: " + this.birth_date + " | " +
                ", identity_document: " + this.identity_document +
                '}';
    }
}
