package com.company;
/*
*
* */
public class Card {

        //atributo
        String color;
        int peso = 0;
        Integer velocidad= 0;
        //contructor

        public Card(String color, int peso){
            this.color = color;
            this.peso = peso;

    }



    //comportamiento
    public void acelerar(Integer cantidad) {

            if(cantidad > 0 && cantidad < 20){
                this.velocidad += cantidad;
            }

    }


    @Override
    public String toString() {
        return "Card{" +
                "color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}
