package model;

import entity.Authors;
import persistence.CRUDGeneric;

import java.util.ArrayList;

public class AuthorsModel implements CRUDGeneric {
    @Override
    public Object create() {
        Authors author = new Authors();



        return null;
    }

    @Override
    public Object readById(int id) {
        return null;
    }

    @Override
    public ArrayList<Object> readAll() {
        return null;
    }

    @Override
    public Object update(Object object, int id) {
        return null;
    }

    @Override
    public Boolean delete() {
        return null;
    }
}
