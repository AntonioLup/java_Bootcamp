package com.company;

public class ConcatText {
    public static void main(String[] args) {
        String concadenacion = "";
        String[] nombres = {"jotaro", "dio", "erina", "joseph"};

        for(int i = 0; i < nombres.length; i++){

            concadenacion += nombres[i] + " ";
            System.out.println(concadenacion);

        }
        System.out.println(concadenacion);


    }
}
