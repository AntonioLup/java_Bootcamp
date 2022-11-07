package com.company;

import com.herencia.Motocicleta;

public class Clases {
    public static void main(String[] args) {
        //clase identificadot = new clase()
//        control + p para ver los atributos de objeto
//        Vehiculo toyota = new Vehiculo();
        Motor motorGTI = new Motor("GTI", 200, 4, 4);
        Vehiculo ford = new Vehiculo("Ford", "Mondea", 2000, false, motorGTI);
        System.out.println(ford.fabricante);
        ford.acelerar(50);
        System.out.println(ford.velocidad +  " " + "esta es la velocidad");
        System.out.println(motorGTI);

//        Motocicleta kawasaki = new Motocicleta();
//        kawasaki.fabricante = "kaea";
//        System.out.println(kawasaki);
//        polimorfismo
        Vehiculo vehiculo;

//        vehiculo = new Motocicleta();
//        vehiculo.acelerar(50);
    }
}
