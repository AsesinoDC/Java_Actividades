package org.riwi.persistence.IModel;

import org.riwi.entity.VacancyEntity;
import org.riwi.persistence.crud.*;

public interface IVacancyModel extends
        Creation<VacancyEntity>,
        ReadAll<VacancyEntity>,
        ReadById<VacancyEntity, Integer>,
        Update<VacancyEntity, Integer>,
        Delete<Integer>,
        SearchById<Integer, Integer, Integer> {
}
