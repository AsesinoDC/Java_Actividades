package org.hospital.entity;

import org.w3c.dom.Text;

public class SpecialtyEntity {
    private int id;
    private String name;
    private String description;

    public SpecialtyEntity(){}

    public SpecialtyEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public SpecialtyEntity(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SpecialtyEntity {" +
                "id: " + this.id +  " | " +
                ", name: " + this.name + " | " +
                ", description: " + this.description +
                '}';
    }
}
