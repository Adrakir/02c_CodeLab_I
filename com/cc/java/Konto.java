package com.cc.java;

class Konto {

    private double kontostand;
    public String besitzer;

    public Konto(String besitzer, double kontostand) {
        this.kontostand = kontostand;
        this.besitzer = besitzer;
    }

    public double getKontostand() {
        return kontostand;
    }

   
    public void setKontostand(double kontostand){
        this.kontostand = kontostand;
    }

    public String getBesitzer() {
        return besitzer;
 
    }
}
