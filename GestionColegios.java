package edu.ucj.programacion.pec1.Mar_Quispe;

import java.util.Scanner;

public class GestionColegios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del colegio:");
        String nombreColegio = scanner.nextLine();

        System.out.println("Introduce la dirección del colegio:");
        String direccionColegio = scanner.nextLine();

        System.out.println("Introduce el número de aulas:");
        int numAulas = scanner.nextInt();

        System.out.println("Introduce el número de alumnos:");
        int numAlumnos = scanner.nextInt();

        scanner.nextLine();

        Colegio colegio = new Colegio(nombreColegio, direccionColegio, numAulas);

        Alumno[] alumnos = UtilsColegio.crearAlumnos(numAlumnos, scanner);

        asignarAsientos(colegio, alumnos);
    }

    public static void asignarAsientos(Colegio colegio, Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            colegio.asignarAsiento(alumno);
        }
    }
}
//En esta clase pediremos el nombre,direccion ,numero de alumnos y de aulas del colegio
//y llamaremos al metodo crearAlumnos de la clase utils para que los utilice 
//en el ultimo bucle ,en el cual llama a la clase colegio y en el al metodo asignarAsiento
		
		

