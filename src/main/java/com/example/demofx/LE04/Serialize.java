package com.example.demofx.LE04;

import java.io.*;

public class Serialize {
    public static void main(String[] args) throws IOException {
        new Serialize().start();
    }

    //Die erstellten Objekte motor & a1 werden gespeichert
    public void  start() throws IOException {

        Motor motor = new Motor(1000);
        Auto a1 = new Auto(motor, "rot");

        OutputStream fos = new FileOutputStream("src/main/java/com/example/demofx/LE04/auto.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);
        oos.close();
    }

    public  void saveList() throws IOException {
        Motor motor = new Motor(1000);
        Auto a1 = new Auto(motor, "rot");
        Auto a2 = new Auto(motor, "blau");
        AutoListe liste = new AutoListe();
        liste.autos.add(a1);
        liste.autos.add(a2);
        OutputStream fos = new FileOutputStream("src/main/java/com/example/demofx/LE04/autoliste.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(liste);
        oos.close();
        saveList();
    }

}
