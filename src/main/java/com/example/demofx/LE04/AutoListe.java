package com.example.demofx.LE04;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AutoListe implements Serializable {

    @Serial
    private static final long serialVersionsUID = 2L;

    List<Auto> autos = new ArrayList<>();

}
