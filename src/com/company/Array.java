package com.company;

public class Array {
    public static void main(String[] args) {

        String array = "antonio";
        String array2 = "antonio";
        String array3 = "antonio";
        String[] arrays = new String[3];

        arrays[0] = array;
        arrays[1] = array2;
        arrays[2] = array3;

        for (int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]);
        }
    }
}
