package arrays;

public class Asignatura {
	private String nombre;
	private double nota;
	
	public Asignatura(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String getNombre() {
		return nombre;
	}
	public double getNota() {
		return nota;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}