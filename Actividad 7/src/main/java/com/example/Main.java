package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Mostrar números del 1 al 100 usando while
        System.out.println("Números del 1 al 100 (usando while):");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        
        // Mostrar números del 1 al 100 usando for
        System.out.println("\nNúmeros del 1 al 100 (usando for):");
        for (int j = 1; j <= 100; j++) {
            System.out.println(j);
        }
        
        // Crear instancia de la clase Números
        Numeros numeros = new Numeros();
        
        // Mostrar números divisibles entre 2 y 3
        System.out.println("\nNúmeros divisibles entre 2 y 3:");
        numeros.mostrarDivisibles();
        
        // Validar entrada de usuario
        System.out.println("\nIngrese un número (debe ser mayor o igual a cero):");
        numeros.validarNumero();
    }
}

// Clase Números
class Numeros {
    // Método para mostrar números divisibles entre 2 y 3
    public void mostrarDivisibles() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    
    // Método para validar entrada de usuario
    public void validarNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean valido = false;
        
        do {
            try {
                numero = scanner.nextInt();
                if (numero >= 0) {
                    System.out.println("Número válido: " + numero);
                    valido = true;
                } else {
                    System.out.println("Número debe ser mayor o igual a cero.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        } while (!valido);
        
        scanner.close();
    }
}