package com.cochecrud;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    private List<CocheObject> cocheColections = new ArrayList<>();

    public void save(CocheObject cocheColection){
        cocheColections.add(cocheColection);
    }
    public List<CocheObject> findAll(){
        return cocheColections;
    }

}
