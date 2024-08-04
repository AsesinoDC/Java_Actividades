package org.airline.persistence.crud;

public interface ReadById <Entity, Id>{
    public Entity readById(Id id);
}
