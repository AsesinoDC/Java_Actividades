package org.riwi.persistence.IModel;


import org.riwi.entity.CompanyEntity;
import org.riwi.persistence.crud.*;

public interface ICompanyModel extends
        Creation<CompanyEntity>,
        ReadAll<CompanyEntity>,
        ReadById<CompanyEntity, Integer>,
        Update<CompanyEntity, Integer> ,
        Delete<Integer> {
}
