package org.airline.entity;


import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
    private int id;
    private String destination;
    private String departure_date;
    private String departure_time;
    private int id_airplane;

    public Flight(){}

    public Flight(String destination, String departure_date,
                  String departure_time, int airplane) {
        this.destination = destination;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.id_airplane = airplane;
    }

    public Flight(int id, String destination, String departure_date,
                  String departure_time, int airplane) {
        this.id = id;
        this.destination = destination;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.id_airplane = airplane;
    }

    public int getId() {
        return this.id;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDeparture_date() {
        return this.departure_date;
    }

    public String getDeparture_time() {
        return this.departure_time;
    }

    public int getAirplane() {
        return this.id_airplane;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public void setAirplane(int airplane) {
        this.id_airplane = airplane;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id: " + this.id +
                ", destination: '" + this.destination +
                ", departure_date: " + this.departure_date +
                ", departure_time: " + this.departure_time +
                ", airplane: " + this.id_airplane +
                '}' + "\n " + "\n";
    }
}
