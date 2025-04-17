package org.lessons.java.shop;

public class Smartphone extends Prodotto {
    // attributi
    private String codiceIMEI;
    private int memoria;

    // costruttori
    public Smartphone(String nome, String marca, double prezzo, int iva, String codiceIMEI, int memoria) {
        super(nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    public Smartphone(double prezzo, int memoria) {
        super(prezzo);
        this.codiceIMEI = "Smartphone senza codice IMEI";
        this.memoria = memoria;
    }

    // getter e setter
    public String getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(String codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + " Smartphone [codiceIMEI=" + codiceIMEI + ", memoria=" + memoria + "]";
    }
}
