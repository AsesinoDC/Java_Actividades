package org.hospital.persistence.IModel;

import org.hospital.entity.QuoteEntity;
import org.hospital.persistence.crud.*;

public interface IQuoteModel extends
        Create<QuoteEntity>,
        ReadAll<QuoteEntity>,
        ReadById<QuoteEntity, Integer>,
        Update<QuoteEntity, Integer>,
        Delete<Integer>,
        SearchById<Integer, Integer, Integer>{
}
