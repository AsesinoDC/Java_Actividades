package org.hospital.entity;

public class MedicoEntity {
    private int id;
    private String name;
    private String last_name;
    private int id_specialty;

    public MedicoEntity() {}

    public MedicoEntity(String name, String last_name, int id_specialty) {
        this.name = name;
        this.last_name = last_name;
        this.id_specialty = id_specialty;
    }

    public MedicoEntity(int id, String name, String last_name, int id_specialty) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.id_specialty = id_specialty;
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

    public int getId_specialty() {
        return this.id_specialty;
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

    public void setId_specialty(int id_specialty) {
        this.id_specialty = id_specialty;
    }

    @Override
    public String toString() {
        return "MedicoEntity {" +
                "id: " + this.id + " | "+
                ", name:  " + this.name + " | " +
                ", last_name: " + this.last_name + " | " +
                ", id_specialty: " + this.id_specialty +
                '}' + "\n";
    }
}
