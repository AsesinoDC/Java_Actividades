package org.riwi.controller;

import org.riwi.entity.VacancyEntity;
import org.riwi.model.VacancyModel;
import org.riwi.persistence.IModel.IVacancyModel;

import java.util.ArrayList;

public class VacancyController {

    private IVacancyModel vacancyModel = new VacancyModel();


    public VacancyEntity creation(VacancyEntity vacancyEntity) {
        return this.vacancyModel.creation(vacancyEntity);
    }
    public boolean delete(int id) {
        return this.vacancyModel.delete(id);
    }

    public ArrayList<VacancyEntity> readAll() {
        return this.vacancyModel.readAll();
    }

    public VacancyEntity readById(int id) {
        return this.vacancyModel.readById(id);
    }

    public Integer searchById(int id, int option) {
        return this.vacancyModel.searchById(id, option);
    }

    public VacancyEntity update(VacancyEntity vacancyEntity, int id) {
        return this.vacancyModel.update(vacancyEntity,id);
    }
}
