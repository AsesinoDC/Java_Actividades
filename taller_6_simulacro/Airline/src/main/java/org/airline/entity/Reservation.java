package org.airline.entity;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private int id_passenger;
    private int id_flight;
    private String reservation_date;
    private String seat;

    public Reservation(){}

    public Reservation(int id_passenger, int id_flight,
                       String reservation_date, String seat) {
        this.id_passenger = id_passenger;
        this.id_flight = id_flight;
        this.reservation_date = reservation_date;
        this.seat = seat;
    }

    public Reservation(int id, int id_passenger, int id_flight,
                    String reservation_date, String seat) {
        this.id = id;
        this.id_passenger = id_passenger;
        this.id_flight = id_flight;
        this.reservation_date = reservation_date;
        this.seat = seat;
    }

    public int getId() {
        return this.id;
    }

    public Integer getId_passenger() {
        return this.id_passenger;
    }

    public Integer getId_flight() {
        return this.id_flight;
    }

    public String getReservation_date() {
        return this.reservation_date;
    }

    public String getSeat() {
        return this.seat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_passenger(int id_passenger) {
        this.id_passenger = id_passenger;
    }

    public void setId_flight(int id_flight) {
        this.id_flight = id_flight;
    }

    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id: " + this.id +
                ", id_passenger: " + this.id_passenger +
                ", id_flight: " + this.id_flight +
                ", reservation_date: " + this.reservation_date +
                ", seat: " + this.seat +
                '}';
    }
}
