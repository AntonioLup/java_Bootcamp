package com.ejerciciosesionobjetos;

public class SmartDevice {
    //atributos
    int width;
    int height;
    String color;

    //contructor
    public SmartDevice() {

    }
    public SmartDevice( int width, int height,String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }


    //metodos

    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("phone",320, 600, "black");
        SmartWatch watcher = new SmartWatch(true,64, 64, "blue");

        System.out.println(iphone);
        System.out.println(watcher);
    }

}
