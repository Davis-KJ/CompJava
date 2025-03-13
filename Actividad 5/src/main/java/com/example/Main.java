package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float op1, op2, op3, op4, val1, val2, val3;

        System.out.println("Ingrese el primer valor: ");
        val1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo valor: ");
        val2 = scanner.nextFloat();
        System.out.println("Ingrese el tercer valor: ");
        val3 = scanner.nextFloat();

        op1 = (val1 + val2) - val3;
        op2 = (val2 - val3) * val1; 
        op3 = (val1 * val2) * val3;
        op4 = (val3 / val1) + val2;


        System.out.println("Primer valor = " + val1);
        System.out.println("Segundo valor = " + val2);
        System.out.println("Segundo valor = " + val3);
        System.out.println("Primera operación: " + op1);
        System.out.println("Segunda operación: " + op2);
        System.out.println("Tercera operación: " + op3);
        System.out.println("Cuarta operación: " + op4);
    }
}