package com.example.demofx.LE04;

import java.io.Serial;
import java.io.Serializable;

public class Motor implements Serializable {

    @Serial
    private static final long serialVersionUID = 4780002103589310496L;
    int hubraum;

    public Motor(int hubraum) {
        this.hubraum = hubraum;
    }

    public int getHubraum() {
        return hubraum;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hubraum=" + hubraum +
                '}';
    }
}
