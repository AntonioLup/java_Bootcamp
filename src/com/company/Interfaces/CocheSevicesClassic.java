package com.company.Interfaces;

import com.company.Card;
import com.company.Interfaces.CocheService;

public class CocheSevicesClassic implements CocheService {
    @Override
    public Card crearCocheDemo() {
        System.out.println("classic");
        return null;
    }

    @Override
    public void destroyCoche(Card coche) {

    }
}
