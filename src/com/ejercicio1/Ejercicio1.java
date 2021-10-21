package com.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        // 1. Números

        // 1.1 Enteros
        byte number1 = 1;
        short number2 = 2;
        int number3 = 3;
        long number4 = 4L;

        System.out.println("byte " + number1);
        System.out.println("short " + number2);
        System.out.println("int " + number3);
        System.out.println("long " + number4);

        // 1.2 Punto flotante
        float decimal1 = 1.1f;
        double decimal2 =  10.2d;

        System.out.println("float " + decimal1);
        System.out.println("double " + decimal2);

        // Carácter
        char caracter1 = 'a';

        System.out.println("char" + caracter1);

        // Booleanos
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("boolean " + verdadero);
        System.out.println("boolean " + falso);

        // Strings
        String nombre = "David";
        String apellido = "Palmero";

        System.out.println("String " + nombre);
        System.out.println("String " + apellido);

        // Tipos envoltorio
        Integer numero = null;
        Long numero2 = null;

        System.out.println("Integer " + numero);
        System.out.println("Long " + numero2);
    }
}