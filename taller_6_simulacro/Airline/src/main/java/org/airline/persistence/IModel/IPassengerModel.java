package org.airline.persistence.IModel;


import org.airline.entity.Passenger;
import org.airline.persistence.crud.*;

public interface IPassengerModel extends
        Creation<Passenger>,
        ReadAll<Passenger>,
        ReadById<Passenger, Integer>,
        Update<Passenger, Integer>,
        Delete<Integer> {
}
