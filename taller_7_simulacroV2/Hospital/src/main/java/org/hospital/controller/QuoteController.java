package org.hospital.controller;

import org.hospital.entity.QuoteEntity;
import org.hospital.model.QuoteModel;
import org.hospital.persistence.IModel.IQuoteModel;

import java.util.ArrayList;

public class QuoteController{
    private final IQuoteModel quoteModel = new QuoteModel();

    public QuoteEntity create(QuoteEntity quoteEntity) {
        return this.quoteModel.create(quoteEntity);
    }

    public Boolean delete(int id) {
        return this.quoteModel.delete(id);
    }

    public ArrayList<QuoteEntity> readAll() {
        return this.quoteModel.readAll();
    }

    public QuoteEntity readById(int id) {
        return this.quoteModel.readById(id);
    }

    public Integer searchById(int id, int option) {
        return this.quoteModel.searchById(id,option);
    }

    public QuoteEntity update(QuoteEntity quoteEntity, int id) {
        return this.quoteModel.update(quoteEntity, id);
    }
}
