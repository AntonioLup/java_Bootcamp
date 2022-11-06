package com.company;

public class FunctionModulo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        boolean result = num1 < num2 && num1 == num2;
        System.out.println(result);
        //opcion 1
        showNumber1();
        //opcion 2
       String numberSting = showNumber2();
        System.out.println(numberSting);
        //opcion 3
        saludo("hola esto es una prop");
    }
    static void showNumber1() {
        System.out.println("hola");
    }
    static String showNumber2() {
        return "5";
    }
    static void saludo(String prop) {
        System.out.println(prop);
    }
}
