package com.company.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD implements EmpleadoCRUDInterface {
    private List<Empleado> empleados = new ArrayList<>();
    //guardar empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }
    public List<Empleado> verEmpleado(){
        return empleados;
    }
}
