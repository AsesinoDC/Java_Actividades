package org.riwi.persistence.IModel;

import org.riwi.entity.CoderEntity;
import org.riwi.persistence.crud.*;

public interface ICoderModel extends
        Creation<CoderEntity>,
        ReadAll<CoderEntity>,
        ReadById<CoderEntity, Integer>,
        Update<CoderEntity, Integer>,
        SearchById<Integer, Integer, Integer>,
        Delete<Integer> {
}
