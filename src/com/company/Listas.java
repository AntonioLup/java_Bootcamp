package com.company;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("antonio");
        nombres.add("antonio");
        nombres.add("antonio");

        System.out.println(nombres);

        for(String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
