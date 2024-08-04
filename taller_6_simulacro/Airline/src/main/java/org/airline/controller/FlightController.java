package org.airline.controller;

import org.airline.entity.Flight;
import org.airline.model.FlightModel;
import org.airline.persistence.IModel.IFlightModel;

import java.util.ArrayList;

public class FlightController {
    private IFlightModel flightModel = new FlightModel();
    public Flight creation(Flight flight){
        return this.flightModel.creation(flight);
    }

    public ArrayList<Flight> readAll(){
        return this.flightModel.readAll();
    }

    public Flight readById(int id){
        return this.flightModel.readById(id);
    }

    public Flight update(Flight flight, int id){
        return this.flightModel.update(flight, id);
    }

    public Boolean delete(int id){
        return this.flightModel.delete(id);
    }

    public Integer searchById(int id){
        return this.flightModel.searchById(id);
    }
}
