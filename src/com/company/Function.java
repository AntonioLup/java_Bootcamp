package com.company;

public class Function {
    public static void main(String[] args) {
        HolaMundo("hi func");
        Sum(2, 2);
        Sum("Hola", "Antonio");
    }

    protected static void HolaMundo(String name) {
        System.out.println(name);
    }
    private static int Sum(int num1,int num2) {
        var result =  num1 + num2;
        System.out.println(result);
        return result;
    }
    private static String Sum(String num1, String num2) {
        var resultNomb =  num1 + " " + num2;
        System.out.println(resultNomb);
        return resultNomb;
    }
}
