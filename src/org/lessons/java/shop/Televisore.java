package org.lessons.java.shop;

public class Televisore extends Prodotto {
    // attributi
    private int dimensioni;
    private boolean isSmart;

    // costruttori
    public Televisore(String nome, String marca, double prezzo, int iva, int dimensioni, boolean isSmart) {
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    public Televisore(double prezzo, int dimensioni) {
        super(prezzo);
        this.dimensioni = dimensioni;
        this.isSmart = false; // valore di default
    }

    // getter e setter
    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return super.toString() + " Televisore [dimensioni=" + dimensioni + ", isSmart=" + isSmart + "]";
    }

    @Override
    public double getPrezzoScontato() {
        if (!isSmart) {
            return prezzo - (prezzo * 0.1);
        } else
            return prezzo - (prezzo * 0.02);
    }
}
