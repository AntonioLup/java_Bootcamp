package com.company;

public class CardElectric extends Card{

    String bateria;


    public void CardElectric( ) {

    }

    public  CardElectric(String bateria, String color, int peso ) {
        super( color, peso );
        this.bateria = bateria;
    }


    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CardElectric{" +
                "bateria='" + bateria + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }



}
