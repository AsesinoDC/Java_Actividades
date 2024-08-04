package org.riwi.persistence.crud;

public interface ReadById <Entity, Id>{
    public Entity readById(Id id);
}
