package org.airline.entity;

public class Airplane {
    private Integer id;
    private String model;
    private int capacity;

    public Airplane(){}

    public Airplane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public Airplane(int id, String model, int capacity){
        this.id = id;
        this.model = model;
        this.capacity = capacity;
    }

    public int getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id: " + id +
                ", model: " + model +
                ", capacity: " + capacity +
                '}' + "\n" + "\n";
    }
}
