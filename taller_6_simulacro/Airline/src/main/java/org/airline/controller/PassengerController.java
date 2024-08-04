package org.airline.controller;

import org.airline.entity.Passenger;
import org.airline.model.PassengerModel;
import org.airline.persistence.IModel.IPassengerModel;

import java.util.ArrayList;

public class PassengerController {
    private IPassengerModel passengerModel = new PassengerModel();

    public Passenger create(Passenger request){
        return this.passengerModel.creation(request);
    }

    public ArrayList<Passenger> readAll(){
        return this.passengerModel.readAll();
    }

    public Passenger readById(int id){
        return this.passengerModel.readById(id);
    }

    public Passenger update(Passenger request, int id){
        return this.passengerModel.update(request, id);
    }

    public Boolean delete(int id){
        return this.passengerModel.delete(id);
    }
}
