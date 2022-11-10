package com.cochecrud;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static CocheCRUD  crud  = null;
    public static void main(String[] args) {
        CocheCRUDImpl crud = new CocheCRUDImpl();

        CocheObject coche = new CocheObject("toyota", 235);
        CocheObject coche2 = new CocheObject("jaguar", 222);
        CocheObject coche3 = new CocheObject("mustan", 115);

        crud.save(coche);
        crud.save(coche2);
        crud.save(coche3);

        List<CocheObject> listCohes = crud.findAll();


        System.out.println(coche);
        System.out.println(listCohes);
    }
}
