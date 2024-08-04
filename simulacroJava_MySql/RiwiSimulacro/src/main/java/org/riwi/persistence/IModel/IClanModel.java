package org.riwi.persistence.IModel;

import org.riwi.entity.ClanEntity;
import org.riwi.persistence.crud.*;

public interface IClanModel extends
        Creation<ClanEntity>,
        ReadAll<ClanEntity>,
        ReadById<ClanEntity, Integer>,
        Update<ClanEntity, Integer>,
        Delete<Integer> {
}
