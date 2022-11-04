package com.company;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("Nombre","antonio");
        System.out.println(personas);
        for (String key : personas.keySet()) {
            System.out.println(key);
        }
        for (String values : personas.values()) {
            System.out.println(values);
        }
        //entrySet() clave valor
    }
}
