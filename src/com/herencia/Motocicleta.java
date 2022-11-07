package com.herencia;

import com.company.Motor;
import com.company.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta(String fabricante, String modelo, int year, boolean sport, Motor motor, boolean baul) {
        super(fabricante, modelo, year, sport, motor);
        this.baul = baul;
    }
}
