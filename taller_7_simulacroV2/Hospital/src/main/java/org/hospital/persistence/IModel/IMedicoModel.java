package org.hospital.persistence.IModel;

import org.hospital.entity.MedicoEntity;
import org.hospital.persistence.crud.*;

public interface IMedicoModel extends
        Create<MedicoEntity>,
        ReadAll<MedicoEntity>,
        ReadById<MedicoEntity, Integer>,
        Update<MedicoEntity, Integer>,
        Delete<Integer>,
        SearchById<Integer, Integer, Integer>{
}
