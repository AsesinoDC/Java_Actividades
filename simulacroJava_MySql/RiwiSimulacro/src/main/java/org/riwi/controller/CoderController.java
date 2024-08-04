package org.riwi.controller;

import org.riwi.entity.CoderEntity;
import org.riwi.model.CoderModel;
import org.riwi.persistence.IModel.ICoderModel;

import java.util.ArrayList;

public class CoderController {

    private ICoderModel coderModel = new CoderModel();
    public CoderEntity creation(CoderEntity coderEntity) {
        return this.coderModel.creation(coderEntity);
    }

    public boolean delete(int id) {
        return this.coderModel.delete(id);
    }

    public ArrayList<CoderEntity> readAll() {
        return this.coderModel.readAll();
    }

    public CoderEntity readById(int id) {
        return this.coderModel.readById(id);
    }

    public Integer searchById(int id, int option) {
        return this.coderModel.searchById(id,option);
    }

    public CoderEntity update(CoderEntity coderEntity, int id) {
        return this.coderModel.update(coderEntity,id);
    }
}
