package com.herencia;

import com.company.Motor;
import com.company.Vehiculo;

public class Camion extends Vehiculo {
     double capacidad;

    public Camion(String fabricante, String modelo, int year, boolean sport, Motor motor, double capacidad) {
        super(fabricante, modelo, year, sport, motor);
        this.capacidad = capacidad;
    }
}
