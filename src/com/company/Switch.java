package com.company;

public class Switch {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("verano");
                break;
            case "autumn":
                System.out.println("otoño");
                break;
            case "spring":
                System.out.println("Primavera");
                break;
            case "winter":
                System.out.println("Invierno");
                break;
            default:
                System.out.println("another season");
                break;

        }
    }
}
