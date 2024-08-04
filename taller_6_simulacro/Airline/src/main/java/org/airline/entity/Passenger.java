package org.airline.entity;

public class Passenger {
    private int id;
    private String name;
    private String last_name;
    private String document_identity;

    public Passenger(){}

    public Passenger(String name, String last_name, String document_identity) {
        this.name = name;
        this.last_name = last_name;
        this.document_identity = document_identity;
    }

    public Passenger(int id, String name, String last_name, String document_identity) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.document_identity = document_identity;
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

    public String getDocument_identity() {
        return this.document_identity;
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

    public void setDocument_identity(String document_identity) {
        this.document_identity = document_identity;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id: " + this.id +
                ", name: " + this.name +
                ", last_name: " + this.last_name +
                ", document_identity: " + this.document_identity +
                '}' + "\n" + "\n";
    }
}
