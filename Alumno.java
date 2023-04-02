package edu.ucj.programacion.pec1.Mar_Quispe;

public class Alumno {
    private String nombre;
    private String apellidos;
    private int dni;
    
    public Alumno(String nombre, String apellidos, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
//En esta clase solo declararemos los atributos y los getters and setters, para luego utilizarlos
//en las demas clases.Estas seran las caracteristicas del alumno


