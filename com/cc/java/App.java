package com.cc.java;

public class App {

    public static void main(String[] args) {
        // Drei Konto-Objekte erstellen
        Konto konto1 = new Konto("Meyer ",10000);
        Konto konto2 = new Konto("Müller ", 10000);
        Konto konto3 = new Konto("Schmidt ", 10000);

        // Kontostände ausgeben
        System.out.println("Konto 1: " + konto1.getBesitzer() + "Kontostand:" + konto1.getKontostand() + " Euro");
        System.out.println("Konto 2: " + konto2.getBesitzer() + "Kontostand:" + konto2.getKontostand() + " Euro");
        System.out.println("Konto 3: " + konto2.getBesitzer() + "Kontostand:"  + konto3.getKontostand() + " Euro");

        // Kontostandänderungen vornehmen
      // Verdopple den Kontostand von Konto 1
      konto1.setKontostand(konto1.getKontostand()*2);
      System.out.println("Konto 1 nach Verdoppelung: " + konto1.getKontostand());

      // Verdreifache den Kontostand von Konto 2
      konto2.setKontostand(konto2.getKontostand()* 3);
      System.out.println("Konto 2 nach Verdreifachung: " + konto2.getKontostand());

      // Verzehnfache den Kontostand von Konto 3
      konto3.setKontostand(konto3.getKontostand()*10);
      System.out.println("Konto 3 nach Verzehnfachung: " + konto3.getKontostand());

        // Kontostände nach den Änderungen ausgeben
        System.out.println("Konto 1: " + konto1.getBesitzer() + konto1.getKontostand() + " Euro");
        System.out.println("Konto 2: " + konto2.getBesitzer() + konto2.getKontostand() + " Euro");
        System.out.println("Konto 3: " + konto3.getBesitzer() + konto3.getKontostand() + " Euro");
    }
}

