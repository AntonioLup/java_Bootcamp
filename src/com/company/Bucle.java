package com.company;

public class Bucle {
    public static void main(String[] args) {
        int num1 = 5;

        for (int i = 0; i <= 1; i++){
            if( i == 5){
                System.out.println("como que 5?");
            }
            System.out.println(i + 1);
        }

        while (num1 <= 10){

            if(num1 == 6){
                //continue;
                break;
            }
            System.out.println("okey im still here " + num1);
            num1++;
        }
    }
}
