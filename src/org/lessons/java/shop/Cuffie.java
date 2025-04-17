package org.lessons.java.shop;

public class Cuffie extends Prodotto {
    // attributi
    private String colore;
    private boolean wireless;

    // costruttori
    public Cuffie(String nome, String marca, double prezzo, int iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public Cuffie(double prezzo, String colore) {
        super(prezzo);
        this.colore = colore;
        this.wireless = false; // valore di default
    }

    // getter e setter
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString() + " Cuffie [colore=" + colore + ", wireless=" + wireless + "]";
    }

    @Override
    public double getPrezzoScontato() {
        if (!wireless) {
            return prezzo - (prezzo * 0.07);
        } else
            return prezzo - (prezzo * 0.02);
    }
}
