package org.riwi.controller;

import org.riwi.entity.ClanEntity;
import org.riwi.model.ClanModel;
import org.riwi.persistence.IModel.IClanModel;

import java.util.ArrayList;

public class ClanController {
    private IClanModel clanModel = new ClanModel();

    public ClanEntity creation(ClanEntity request) {
        return this.clanModel.creation(request);
    }

    public ArrayList<ClanEntity> readAll() {
        return this.clanModel.readAll();
    }

    public ClanEntity readById(int id) {
        return this.clanModel.readById(id);
    }

    public ClanEntity update(ClanEntity clanEntity, int id) {
        return this.clanModel.update(clanEntity, id);
    }
    public Boolean delete(int id){
        return this.clanModel.delete(id);
    }
}
