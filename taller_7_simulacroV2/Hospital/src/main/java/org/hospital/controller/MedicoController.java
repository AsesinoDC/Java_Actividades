package org.hospital.controller;

import org.hospital.entity.MedicoEntity;
import org.hospital.model.MedicoModel;
import org.hospital.persistence.IModel.IMedicoModel;

import java.util.ArrayList;

public class MedicoController{
    private final IMedicoModel medicoModel = new MedicoModel();

    public MedicoEntity create(MedicoEntity medicoEntity) {
        return this.medicoModel.create(medicoEntity);
    }

    public Boolean delete(int id) {
        return this.medicoModel.delete(id);
    }

    public ArrayList<MedicoEntity> readAll() {
        return this.medicoModel.readAll();
    }

    public MedicoEntity readById(int id) {
        return this.medicoModel.readById(id);
    }

    public Integer searchById(int id, int option) {
        return this.medicoModel.searchById(id,option);
    }

    public MedicoEntity update(MedicoEntity medicoEntity, int id) {
        return this.medicoModel.update(medicoEntity, id);
    }
}
