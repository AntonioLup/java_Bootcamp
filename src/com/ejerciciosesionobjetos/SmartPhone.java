package com.ejerciciosesionobjetos;

public class SmartPhone extends SmartDevice {

    String modelo;

    public SmartPhone(){
        super();
    }

    public SmartPhone(String modelo,  int width, int height,String color) {
        super(width, height, color);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "modelo='" + modelo + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
