package com.company;

public class EstructurasDeControl {
    public static void main(String[] args) {
        int edad = 17;
        String dia = "lunes";
//        para string
        boolean resultadoDia = dia.equals("martes");
//        para numbers
        boolean resultadoNum = 5 == 5;


        if(edad > 21){
            System.out.println("puedes pasar");
        }else {
            System.out.println("no");
        }

        switch (dia){
            case "lunes":
                System.out.println("lunes");
                break;
            case "martes":
                System.out.println("martes");
                break;
             default:
                 System.out.println("no se");
                 break;
        }
//        es verdadera hasta que llegue a falsa
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        String[] nombres = {"antonio", "jojos", "kaijus"};
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
        for(String nombre : nombres){
            System.out.println(nombre);
        }
//        mientras sea verdadero
        int count = 0;
        while(count < 5){
            count++;

        }
    }
}
