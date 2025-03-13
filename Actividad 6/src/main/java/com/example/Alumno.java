package com.example;

public class Alumno {
    private String nombre;
    private double[] calificaciones;

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacion(double promedio) {
        if (promedio >= 91 && promedio <= 100) {
            return 'A';
        } else if (promedio >= 81 && promedio <= 90) {
            return 'B';
        } else if (promedio >= 71 && promedio <= 80) {
            return 'C';
        } else if (promedio >= 61 && promedio <= 70) {
            return 'D';
        } else if (promedio >= 51 && promedio <= 60) {
            return 'E';
        } else {
            return 'F';
        }
    }
    public void mostrarResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del Alumno: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}