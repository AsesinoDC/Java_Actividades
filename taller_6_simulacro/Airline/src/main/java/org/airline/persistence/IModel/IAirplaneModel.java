package org.airline.persistence.IModel;

import org.airline.entity.Airplane;
import org.airline.persistence.crud.*;

public interface IAirplaneModel extends
        Creation<Airplane>,
        ReadAll<Airplane>,
        ReadById<Airplane, Integer>,
        Update<Airplane, Integer>,
        Delete<Integer> {
}
