package com.cochecrud;

import java.util.List;

public interface CocheCRUD {
     void save(CocheObject cocheColection);
     List<CocheObject> findAll();

}
