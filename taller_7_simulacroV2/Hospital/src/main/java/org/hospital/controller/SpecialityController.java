package org.hospital.controller;

import org.hospital.entity.SpecialtyEntity;
import org.hospital.model.SpecialityModel;
import org.hospital.persistence.IModel.ISpecialityModel;

import java.util.ArrayList;

public class SpecialityController{
    private final ISpecialityModel  specialityModel = new SpecialityModel();

    public SpecialtyEntity create(SpecialtyEntity specialtyEntity) {
        return this.specialityModel.create(specialtyEntity);
    }

    public Boolean delete(int id) {
        return this.specialityModel.delete(id);
    }

    public ArrayList<SpecialtyEntity> readAll() {
        return this.specialityModel.readAll();
    }

    public SpecialtyEntity readById(int id) {
        return this.specialityModel.readById(id);
    }

    public SpecialtyEntity update(SpecialtyEntity specialtyEntity, int id) {
        return this.specialityModel.update(specialtyEntity,id);
    }
}
