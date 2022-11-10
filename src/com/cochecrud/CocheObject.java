package com.cochecrud;

public class CocheObject {
    String nombre;
    int year;

    public CocheObject(String nombre, int year) {
        this.nombre = nombre;
        this.year = year;
    }



    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "nombre='" + nombre + '\'' +
                ", year=" + year +
                '}';
    }

}
