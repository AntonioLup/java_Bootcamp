package com.company;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class EjercicioTema789 {
    public static void main(String[] args) {
//        string invertido
        String hola = "hola mundo";
        String invertido = "";


        for(int i = hola.length() - 1; i >= 0 ; i--){
            invertido += hola.charAt(i);
        }
        System.out.println(invertido);
        System.out.println(hola);
        //    array unidireccional
        double  notas[] = {6.7, 7.5, 5.3, 8.75, 3.6, 6.5};

        for (double nota : notas) {
            System.out.println(nota);
        }
//        ArrayBidimensional
        int [][] num = {
                {3,3,3},
                {4,4,4}
        };
        for (int i = 0; i < num.length; i++){
            for(int y = 0; y< num[i].length; y++){
                System.out.println(num[i][y]);
            }
        }
//        Vectores
        Vector vector = new Vector();

        vector.add("antonio");
        vector.add("maria");
        vector.add("laura");
        vector.add("ana");
        System.out.println(vector);
        vector.remove("maria");
        vector.remove("laura");
        System.out.println(vector);
//        respuesta a los vectores
        System.out.println("porque se desperdicia inutilmente la memoria del ordenador");
//       ArrayList
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("antonio");
        lista.add("antonio");
        lista.add("antonio");
        lista.add("antonio");
        lista.add("antonio");

        LinkedList<String> linkList = new LinkedList<String>();

        for (int i = 0 ; i< lista.size(); i++){
            linkList.add(i, lista.get(i));
        }
        for (String elementos : lista) {
            System.out.print(elementos + " ");
        }

        for (String elementos : linkList) {
            System.out.print(elementos + " ");
        }
//      ArrayInt

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 33; i++) {
            list.add(i);

            for (int number = 0; number < list.size(); number++) {

                if (list.get(number) % 2 == 0) {
                    list.remove(number);
                }
            }
        }

        System.out.println("estos numero no son pares" + list);

//      DividePorCero


    }
    public static class DividePorCero{
       private static int Divide (int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Indica los numeros que quieres dividir: ");
            System.out.print("Numero 1: ");
            int a = scanner.nextInt();
            System.out.print("Numero 2: ");
            int b = scanner.nextInt();
            try {
                System.out.println("Resultado: " + Divide(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse");
            } finally {
                System.out.println("Demo de código");
            }

        }
        public static class CopiarFicheros {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce el fichero de origen: ");
                String fileIn = scanner.nextLine();
                System.out.println("Introduce el fichero de destino: ");
                String fileOut = scanner.nextLine();
                copiar(fileIn, fileOut);
            }

            private static void copiar(String fileIn, String fileOut) {
                try {
                    InputStream in = new FileInputStream(fileIn);
                    byte[] datos = in.readAllBytes();
                    in.close();

                    PrintStream out = new PrintStream(fileOut);
                    out.write(datos);
                    out.close();
                } catch (Exception e) {
                    System.out.println("Excepcion: " + e.getMessage());
                }
            }

        }
    }

}
