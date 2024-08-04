package org.riwi.controller;

import org.riwi.entity.CompanyEntity;
import org.riwi.model.CompanyModel;
import org.riwi.persistence.IModel.ICompanyModel;

import java.util.ArrayList;

public class CompanyController{
    private ICompanyModel companyModel = new CompanyModel();

    public CompanyEntity creation(CompanyEntity companyEntity) {
        return this.companyModel.creation(companyEntity);
    }

    public ArrayList<CompanyEntity> readAll() {
        return this.companyModel.readAll();
    }

    public CompanyEntity readById(int id) {
        return this.companyModel.readById(id);
    }

    public CompanyEntity update(CompanyEntity companyEntity, int id) {
        return this.companyModel.update(companyEntity, id);
    }

    public Boolean delete(int id){
        return this.companyModel.delete(id);
    }
}
