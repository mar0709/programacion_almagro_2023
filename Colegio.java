package edu.ucj.programacion.pec1.Mar_Quispe;

public class Colegio {
    private String nombre;
    private String direccion;
    private Aula[] aulas;

    public Colegio(String nombre, String direccion, int numAulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aulas = new Aula[numAulas];
        for (int i = 0; i < numAulas; i++) {
            this.aulas[i] = new Aula(i+1, 0);
        }
    }

    public boolean asignarAsiento(Alumno alumno) {
        for (int i = 0; i < this.aulas.length; i++) {
            if (this.aulas[i].asignarAsiento(alumno)) {
                System.out.println("Asignado asiento en el aula " + (i+1) + " al alumno " + alumno.getNombre() + " " + alumno.getApellidos() + " con DNI " + alumno.getDni());
                return true;
            }
        }
        System.out.println("No hay asientos libres en ninguna aula para el alumno " + alumno.getNombre() + " " + alumno.getApellidos() + " con DNI " + alumno.getDni());
        return false;
    }
}
//En esta clase relizaremos un metodo booleano para asignar el asiento ,con ayuda del metodo de 
//aulas.Este nos devolvera el aula mombre y apellido y dni del alumno.Cuando no haya asientos 
//no ejecutara el bucle

