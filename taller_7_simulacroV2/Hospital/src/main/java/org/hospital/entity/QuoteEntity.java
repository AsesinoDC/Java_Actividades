package org.hospital.entity;

public class QuoteEntity {
    private int id;
    private int id_patient;
    private int id_medico;
    private String quote_date;
    private String quote_hour;
    private String motive;

    public QuoteEntity() {}

    public QuoteEntity(int id_patient, int id_medico, String quote_date, String quote_hour, String motive) {
        this.id_patient = id_patient;
        this.id_medico = id_medico;
        this.quote_date = quote_date;
        this.quote_hour = quote_hour;
        this.motive = motive;
    }

    public QuoteEntity(int id, int id_patient, int id_medico,
                       String quote_date, String quote_hour, String motive) {
        this.id = id;
        this.id_patient = id_patient;
        this.id_medico = id_medico;
        this.quote_date = quote_date;
        this.quote_hour = quote_hour;
        this.motive = motive;
    }
}
