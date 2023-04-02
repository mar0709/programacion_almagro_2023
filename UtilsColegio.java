package edu.ucj.programacion.pec1.Mar_Quispe;

import java.util.Scanner;

public class UtilsColegio {
	 public static Alumno[] crearAlumnos(int numAlumnos, Scanner scanner) {
	        Alumno[] alumnos = new Alumno[numAlumnos];
	        for (int i = 0; i < numAlumnos; i++) {
	            System.out.println("Introduce el nombre del alumno " + (i+1) + ":");
	            String nombre = scanner.nextLine();

	            System.out.println("Introduce los apellidos del alumno " + (i+1) + ":");
	            String apellidos = scanner.nextLine();

	            System.out.println("Introduce el DNI del alumno " + (i+1) + ":");
	            int dni = scanner.nextInt();

	            alumnos[i] = new Alumno(nombre, apellidos, dni);
	        }
	        return alumnos;
	}
}
//En esta clase pediremos nombre,appelidos y dni del alumno