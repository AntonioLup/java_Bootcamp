package com.company;

public class FnIva {
    public static void main(String[] args) {
        int precio = 120;
        int iva = 21;

        int result = getIva(precio, iva);
        System.out.println(result);
    }
    static int getIva(int precio, int iva){
        return precio * iva / 100;
    }

}
