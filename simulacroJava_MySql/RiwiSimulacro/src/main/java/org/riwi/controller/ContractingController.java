package org.riwi.controller;

import org.riwi.entity.CoderEntity;
import org.riwi.entity.ContractingEntity;
import org.riwi.model.CoderModel;
import org.riwi.model.ContractingModel;
import org.riwi.persistence.IModel.ICoderModel;
import org.riwi.persistence.IModel.IContractingModel;

import java.util.ArrayList;

public class ContractingController {
    private IContractingModel contractingModel = new ContractingModel();

    public ContractingEntity creation(ContractingEntity contracting) {
        return this.contractingModel.creation(contracting);
    }

    public boolean delete(int id) {
        return this.contractingModel.delete(id);
    }

    public ArrayList<ContractingEntity> readAll() {
        return this.contractingModel.readAll();
    }

    public ContractingEntity readById(int id) {
        return this.contractingModel.readById(id);
    }

    public Integer searchById(int id, int option) {
        return this.contractingModel.searchById(id,option);
    }

    public ContractingEntity update(ContractingEntity contracting, int id) {
        return this.contractingModel.update(contracting,id);
    }
}
