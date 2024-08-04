package org.riwi.entity;

import org.riwi.persistence.enums.CohortesEmun;

public class CoderEntity {
    private int id;
    private String name;
    private String last_name;
    private String identity_document;
    private String technology;
    private CohortesEmun cohorte;
    private int id_clan;

    public CoderEntity() {}

    public CoderEntity(String name, String last_name,
                       String identity_document, String technology, CohortesEmun cohorte, int id_clan) {
        this.name = name;
        this.last_name = last_name;
        this.identity_document = identity_document;
        this.technology = technology;
        this.cohorte = cohorte;
        this.id_clan = id_clan;
    }

    public CoderEntity(int id, String name, String last_name,
                       String identity_document, String technology, CohortesEmun cohorte, int id_clan) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.identity_document = identity_document;
        this.technology = technology;
        this.cohorte = cohorte;
        this.id_clan = id_clan;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getIdentity_document() {
        return identity_document;
    }

    public String getTechnology() {
        return technology;
    }

    public CohortesEmun getCohorte() {
        return cohorte;
    }

    public int getId_clan() {
        return id_clan;
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

    public void setIdentity_document(String identity_document) {
        this.identity_document = identity_document;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setCohorte(CohortesEmun cohorte) {
        this.cohorte = cohorte;
    }

    public void setId_clan(int id_clan) {
        this.id_clan = id_clan;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "id: " + this.id + " | " +
                ", name: " + this.name + " | " +
                ", last_name: " + this.last_name + " | " +
                ", identity_document: " + this.identity_document + " | " +
                ", technology: " + this.technology + " | " +
                ", cohorte: " + this.cohorte + " | " +
                ", id_clan: " + this.id_clan +
                '}' +  "\n" + "\n";
    }
}
