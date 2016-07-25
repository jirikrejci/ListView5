package com.example.jirka.listview5;

/**
 * Created by Jirka on 23.6.2016.
 */
public class Polozka {

    private int obrId;
    private String nazev;
    private String popis;


    public Polozka(int obrId, String nazev, String popis) {
        this.obrId = obrId;
        this.nazev = nazev;
        this.popis = popis;
    }

    //getters and setters
    public int getObrId() {return obrId;}
    public void setObrId(int obrId) {this.obrId = obrId;}
    public String getNazev() {return nazev; }
    public void setNazev(String nazev) {this.nazev = nazev;}
    public String getPopis() {return popis;}
    public void setPopis(String popis) {this.popis = popis;}

    //overeide getString

    @Override
    public String toString() {
        return nazev + "\n" + popis;
    }


// konstruktor

}
