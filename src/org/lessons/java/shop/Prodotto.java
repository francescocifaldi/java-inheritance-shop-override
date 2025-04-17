package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    // attributi
    protected int codice;
    protected String nome;
    protected String marca;
    protected double prezzo;
    protected int iva;

    // costruttori
    public Prodotto(String nome, String marca, double prezzo, int iva) {
        Random random = new Random();
        this.codice = random.nextInt(9999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto(double prezzo) {
        Random random = new Random();
        this.codice = random.nextInt(9999);
        this.nome = "Prodotto senza nome";
        this.marca = "Prodotto senza marca";
        this.prezzo = prezzo;
        this.iva = 22;
    }

    // getter e setter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    // metodi
    public double calcolaPrezzoFinale() {
        return prezzo + (prezzo * iva / 100);
    }

    public String getFullname() {
        return codice + "-" + nome + "-" + marca;
    }

    public double getPrezzoScontato() {
        return calcolaPrezzoFinale() - (calcolaPrezzoFinale() * 0.02);
    }

    @Override
    public String toString() {
        return getFullname();
    }

}
