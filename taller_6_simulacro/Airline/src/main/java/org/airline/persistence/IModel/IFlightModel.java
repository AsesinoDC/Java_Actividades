package org.airline.persistence.IModel;

import org.airline.entity.Flight;
import org.airline.persistence.crud.*;

public interface IFlightModel extends
        Creation<Flight>,
        ReadAll<Flight>,
        ReadById<Flight, Integer>,
        Update<Flight, Integer>,
        Delete<Integer>,
        SearchById<Integer>{
}
