package org.hospital.persistence.crud;

public interface SearchById <Search, Id, Option>{
    public Search searchById(Id id, Option option);
}
