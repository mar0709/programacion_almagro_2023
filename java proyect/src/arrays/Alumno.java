package arrays;


public class Alumno {
	private String nombre; 
	private String apellido;
	private Asignatura [] asignaturas  ; 
	
	
	public Alumno(String nombre, String apellido, Asignatura[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.asignaturas= asignaturas;
	}
	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
		
}
