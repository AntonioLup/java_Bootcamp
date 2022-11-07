package com.ejerciciosesionobjetos;

public class SmartDevice {
    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone(320, 600, "black");
        SmartWatch watcher = new SmartWatch(64, 64, "blue");

        System.out.println(iphone.width);
        System.out.println(watcher.color);
    }

}
