package org.riwi.persistence.IModel;

import org.riwi.entity.ContractingEntity;
import org.riwi.persistence.crud.*;

public interface IContractingModel extends
        Creation<ContractingEntity>,
        ReadAll<ContractingEntity>,
        ReadById<ContractingEntity, Integer>,
        Update<ContractingEntity, Integer>,
        Delete<Integer>,
        SearchById<Integer, Integer, Integer> {
}
