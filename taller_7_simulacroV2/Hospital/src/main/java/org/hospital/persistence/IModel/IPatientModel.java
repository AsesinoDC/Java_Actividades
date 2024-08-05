package org.hospital.persistence.IModel;

import org.hospital.entity.PatientEntity;
import org.hospital.persistence.crud.*;

public interface IPatientModel extends
        Create<PatientEntity>,
        ReadAll<PatientEntity>,
        ReadById<PatientEntity, Integer>,
        Update<PatientEntity, Integer>,
        Delete<Integer> {
}
