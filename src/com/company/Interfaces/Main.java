package com.company.Interfaces;

import java.util.List;

public interface Main {
    static EmpleadoCRUDInterface empleadoCRUD = null;

    public static void main(String[] args) {
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado antonio = new Empleado("antonio", 22, 4000, true);
        Empleado maria = new Empleado("antonio", 25, 4500, true);
        Empleado andrea = new Empleado("andrea", 26, 3200, false);
        empleadoCRUD.guardar(antonio);
        empleadoCRUD.guardar(maria);
        empleadoCRUD.guardar(andrea);


        List<Empleado> empleados = empleadoCRUD.verEmpleado();
        System.out.println(empleados);
    }
}
