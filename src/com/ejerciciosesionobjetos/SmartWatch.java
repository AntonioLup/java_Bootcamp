package com.ejerciciosesionobjetos;

public class SmartWatch extends SmartDevice {

    boolean conectividad;

    public SmartWatch() {
        super();
    }

    public SmartWatch(boolean conectividad,   int width, int height,String color) {
        super(width, height, color);
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "conectividad='" + conectividad + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
