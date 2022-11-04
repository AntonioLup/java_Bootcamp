package com.company;

public class IfElse {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;
        boolean check = num1 < num2;

        if(check){
            System.out.println(num1 + " "+"es menor que" + " "+num2);
        }else{
            System.out.println(num1 + " "+"es mayor que" + " "+num2);
        }
    }
}
