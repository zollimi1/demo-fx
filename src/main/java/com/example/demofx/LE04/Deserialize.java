package com.example.demofx.LE04;

import java.io.*;

public class Deserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Deserialize().start();
    }

    //Die erstellten Objekte motor & a1 werden aus dem File auto.ser zurückgeholt
    public void start() throws IOException, ClassNotFoundException {
        InputStream fis = new FileInputStream("src/main/java/com/example/demofx/LE04/auto.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Auto auto = (Auto) ois.readObject();
        System.out.println("auto = " + auto);
        ois.close();
    }
}
