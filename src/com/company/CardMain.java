package com.company;

public class CardMain {
    public static void main(String[] args) {
        Card cardObject = new Card("red", 25);
        cardObject.acelerar(40);

        System.out.println(cardObject);

        CardElectric newElectric = new CardElectric("gastada", "green", 24);
        newElectric.acelerar(59);

        System.out.println(newElectric);
    }

}
