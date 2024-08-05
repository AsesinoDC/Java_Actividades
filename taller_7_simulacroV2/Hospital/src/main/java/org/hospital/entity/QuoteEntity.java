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

    public int getId() {
        return this.id;
    }

    public int getId_patient() {
        return this.id_patient;
    }

    public int getId_medico() {
        return this.id_medico;
    }

    public String getQuote_date() {
        return this.quote_date;
    }

    public String getQuote_hour() {
        return this.quote_hour;
    }

    public String getMotive() {
        return this.motive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public void setQuote_date(String quote_date) {
        this.quote_date = quote_date;
    }

    public void setQuote_hour(String quote_hour) {
        this.quote_hour = quote_hour;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    @Override
    public String toString() {
        return "QuoteEntity{" +
                "id: " + this.id +
                ", id_patient: " + this.id_patient +
                ", id_medico: " + this.id_medico +
                ", quote_date: " + this.quote_date +
                ", quote_hour: " + this.quote_hour +
                ", motive: " + this.motive +
                '}'+ "\n";
    }
}
