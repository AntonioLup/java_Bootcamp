package com.company;

public class Vehiculo {
    // atributos
   protected String fabricante;
    protected String modelo;
    protected int year;
    protected boolean sport;
    protected int velocidad;
    protected  Motor motor;
    //contructor
    public Vehiculo(String fabricante, String modelo,  int year, boolean sport, Motor motor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.sport = sport;
        this.velocidad = 0;
        this.motor = motor;

    }
    //metodos
    public void acelerar(int quantity){
        this.velocidad += quantity;
    }

}
