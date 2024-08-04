package org.airline.persistence.IModel;


import org.airline.entity.Reservation;
import org.airline.persistence.crud.*;

public interface IReservationModel extends
        Creation<Reservation>,
        ReadAll<Reservation>,
        ReadById<Reservation, Integer>,
        Update<Reservation, Integer>,
        Delete<Integer>,
        SearchById<Integer>{
}
