package encapsulacion;

public class Alumno {

	// Variables de instancia (atributos de un objeto)
	private String nombre;
	private String apellidos;
	private double notaMedia;
	private Asignatura asignaturaAlumno;

	public Alumno(String nombre, String apellidos, double notaMedia, Asignatura asignaturaAlumno) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
		this.asignaturaAlumno = asignaturaAlumno;
	}

	// Constructor (me sirven para inicializar los atrib de las clases)

	public Alumno(String nombre, String apellidos, Asignatura asignaturaAlumno , double nota) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturaAlumno=asignaturaAlumno;
		this.notaMedia=nota;
	}

	//public Alumno(String nombre, String apellidos, double notaMedia) {
		//super();
		//this.nombre = nombre;
		//this.apellidos = apellidos;
		//this.notaMedia = notaMedia;
	//}

	// Getter para que solo lo pueda ver

	public String getNombre() {
		return nombre;
	}
	// para modificar la info y dejo que lo vea

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter para apell y notaMedia
	public String getApellidos() {
		return apellidos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}
	// para modificar la info y dejo que lo vea

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public Asignatura getAsignaturaAlumno() {
		return asignaturaAlumno;
	}

	public void setAsignaturaAlumno(Asignatura asignaturaAlumno) {
		this.asignaturaAlumno = asignaturaAlumno;
	}

	// metodo o funciones
	public void estudiar() {
		System.out.println("El alumno " + this.nombre + " esta estudiando y tiene una nota " + notaMedia
				+ " y su apellido es " + apellidos +" .Estudia "+ asignaturaAlumno.getNombre()+ asignaturaAlumno.getNota());

	
	}
	
}
