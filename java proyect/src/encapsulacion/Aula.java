package encapsulacion;

public class Aula {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Asignatura asignatura1=new Asignatura("Programacion",7.0);
		Asignatura asignatura2=new Asignatura("Mates",8.0);
		Asignatura asignatura3=new Asignatura("Ciencia",12.0);
		Alumno alumno1=new Alumno("Nombre1","Apellido1",asignatura1,7.0);
	//Alumno1.nombre="Juan;
		alumno1.setNombre("Angel"); //EL SET ES PARA QUE EN VEZ DE MOSTRARME LO INTRODUCIDO EN LINEA 10 ME INTRODUZCA EL SET
		alumno1.setApellidos("Lorca");
		//alumno1.setNotaMedia(10);
		//alumno1.getAsignaturaAlumno();
		alumno1.estudiar();
		//System.out.println(alumno1.getNombre()); //Con get Solo te muestra el nombre
		
		Alumno alumno2=new Alumno("Nombre2","Apellido2",asignatura2,8.0);
		alumno2.setNombre("Pepe");
		alumno2.setApellidos("Garcia");
		//alumno2.setNotaMedia(9);
		alumno2.estudiar();
		
		//Alumno alumno3=new
		
		Alumno alumno3=new Alumno ("Alumno3","Apellido3",asignatura3,11.0);
		alumno3.setNombre("Sara");
		alumno3.setApellidos("Lopez");
		alumno3.estudiar();
		//alumno1.setAsignaturaAlumno(asignatura2);
		
		//System.out.println(alumno3.getAsignaturaAlumno().getNota() );
		
		//System.out.println(asignatura1.getNombre());
		//System.out.println(asignatura1.getNota());
		
		//System.out.println(alumno2.getAsignaturaAlumno());
		//System.out.println(alumno2.getAsignaturaAlumno());
		//System.out.println(alumno3.getAsignaturaAlumno());
		//System.out.println(alumno1.getAsignaturaAlumno());
		//System.out.println(alumno1.getAsignaturaAlumno().getNota() );
	}

}
