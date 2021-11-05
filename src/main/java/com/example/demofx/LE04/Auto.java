package com.example.demofx.LE04;

import java.io.Serial;
import java.io.Serializable;

public class Auto implements Serializable {

    Motor motor;
    String farbe;

    @Serial
    private static final long serialVersionUID = -218730653685179327L;

    public Auto(Motor motor, String farbe) {
        this.motor = motor;
        this.farbe = farbe;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "motor=" + motor +
                ", farbe='" + farbe + '\'' +
                '}';
    }
}
