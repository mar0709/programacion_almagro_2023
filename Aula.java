package edu.ucj.programacion.pec1.Mar_Quispe;

public class Aula{
	private int numero;
    private int planta;
    private Alumno[] asientos;

    public Aula(int numero, int planta) {
        this.numero = numero;
        this.planta = planta;
        this.asientos = new Alumno[3];
    }

    public boolean asignarAsiento(Alumno alumno) {
        for (int i = 0; i < this.asientos.length; i++) {
            if (this.asientos[i] == null) {
                this.asientos[i] = alumno;
                System.out.println("Asignado asiento " + (i+1) + " en el aula " + this.numero);
                return true;
            }
        }
        return false;
    }
}
//Primero declaramos los atributos de la clase aula , en este caso los asientos seran en un array de Alumnos
//para asi poder realizar el metodo booleano en el cual le asignaremos asientos a cada alumno de 3 en 3,ya que , en una 
//aula solo podran entrar 3 .Lo haremos con un bucle for en el cual ira asignando un asiento a cada alumno,si el alumno 
//ya tiene asignado un asiento devolvera false
