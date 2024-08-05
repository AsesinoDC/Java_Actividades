package org.hospital.persistence.IModel;

import org.hospital.entity.SpecialtyEntity;
import org.hospital.persistence.crud.*;

public interface ISpecialityModel extends
        Create<SpecialtyEntity>,
        ReadAll<SpecialtyEntity>,
        ReadById<SpecialtyEntity, Integer>,
        Update<SpecialtyEntity, Integer>,
        Delete<Integer>{
}
