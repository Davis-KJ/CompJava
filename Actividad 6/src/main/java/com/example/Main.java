package com.example;

public class Main {
    public static void main(String[] args) {
        String nombreAlumno = "Juan Pérez";
        double[] calificaciones = {60, 65.5 , 50, 50, 60};
        
        Alumno alumno = new Alumno(nombreAlumno, calificaciones);
        double promedio = alumno.calcularPromedio();
        char calificacion = alumno.obtenerCalificacion(promedio);
        alumno.mostrarResultados(nombreAlumno, promedio, calificacion);
    }
}