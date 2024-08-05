package org.hospital.controller;

import org.hospital.entity.PatientEntity;
import org.hospital.model.PatientModel;
import org.hospital.persistence.IModel.IPatientModel;

import java.util.ArrayList;

public class PatientController {
    private final IPatientModel patientModel = new PatientModel();

    public PatientEntity create(PatientEntity patientEntity) {
        return this.patientModel.create(patientEntity);
    }

    public Boolean delete(int id) {
        return this.patientModel.delete(id);
    }

    public ArrayList<PatientEntity> readAll() {
        return this.patientModel.readAll();
    }

    public PatientEntity readById(int id) {
        return this.patientModel.readById(id);
    }

    public PatientEntity update(PatientEntity patientEntity, int id) {
        return this.patientModel.update(patientEntity, id);
    }
}
