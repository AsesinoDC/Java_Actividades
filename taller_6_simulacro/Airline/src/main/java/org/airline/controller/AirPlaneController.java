package org.airline.controller;

import org.airline.entity.Airplane;
import org.airline.model.AirplaneModel;
import org.airline.persistence.IModel.IAirplaneModel;

import java.util.ArrayList;

public class AirPlaneController{
    private IAirplaneModel airplaneModel = new AirplaneModel();

    public Airplane create(Airplane request){
        return this.airplaneModel.creation(request);
    }

    public ArrayList<Airplane> readAll(){
        return this.airplaneModel.readAll();
    }

    public Airplane readById(int id){
        return this.airplaneModel.readById((Integer)id);
    }

    public Airplane update(Airplane request, int id){
        return this.airplaneModel.update(request, id);
    }

    public Boolean delete(int id){
        return this.airplaneModel.delete(id);
    }
}
