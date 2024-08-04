package persistence;

import java.util.ArrayList;

public interface CRUDGeneric {
    public Object create();
    public Object readById(int id);
    public ArrayList<Object> readAll();
    public Object update(Object object, int id);
    public Boolean delete();
}
