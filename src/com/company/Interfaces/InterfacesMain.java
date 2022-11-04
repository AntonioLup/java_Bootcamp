package com.company.Interfaces;

import com.company.Card;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service1 = new CocheServiceSports();
        CocheService service2 = new CocheSevicesClassic();

        Card coche1 = service1.crearCocheDemo();
        Card coche2 = service2.crearCocheDemo();
    }
}
