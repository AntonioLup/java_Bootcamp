package com.company.Interfaces;

public class Empleado {
    String nombre;
    int edad;
    double salarial;
    boolean alta;

    public Empleado(String nombre, int edad, double salarial, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarial = salarial;
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarial=" + salarial +
                ", alta=" + alta +
                '}';
    }
}
