package com.company.Interfaces;

import com.company.Card;
import com.company.Interfaces.CocheService;

public class CocheServiceSports implements CocheService {
    @Override
    public Card crearCocheDemo() {
        System.out.println("sport");

        return null;
    }

    @Override
    public void destroyCoche(Card coche) {

    }
}
