package arrays;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura asignatura1Alumno1=new Asignatura("Mates",6.0);
		Asignatura asignatura2Alumno1=new Asignatura("Ciencia",7.0); 
		Asignatura [] asignaturasAlumno1= {asignatura1Alumno1,asignatura2Alumno1};
		Alumno alumno1=new Alumno("Nombre1","Apellido1",asignaturasAlumno1);   
		
		
		Asignatura asignatura1Alumno2=new Asignatura("Mates",6.0);
		Asignatura asignatura2Alumno2=new Asignatura("Ciencia",2.0); 
		Asignatura [] asignaturasAlumno2= {asignatura1Alumno2,asignatura2Alumno2};	
		Alumno alumno2=new Alumno("Nombre2","Apellido2",asignaturasAlumno2);
		alumno2.setAsignaturas(asignaturasAlumno2);

		//Creo el aula con los alumnos
		Alumno[] alumnos= {alumno1,alumno2};
		
	
		System.out.println("Hay "+alumnos.length+" alumnos en el aula"); //Cuantos alumnos tengo?
		
		//Mostramos nombre del alumno ,asignatura y nota de cada una
		//Recorren array de manera rapida y todos los elementos fore cntrl+espacio
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
			Asignatura[] asignaturasAlumno=alumno.getAsignaturas();//Recorremos el array de asignaturas para sacar su nombre y su nota
			for (Asignatura asignatura : asignaturasAlumno) {
				System.out.println("\t"+asignatura.getNombre()+",nota: "+asignatura.getNota());
			}
		}
		
		//Calculamos nota media de todos los alumnos
		double notasAlumnos=0;
		int totalAsignaturas=0;//Este
		for (Alumno alumno : alumnos) {
			Asignatura[] asignaturasAlumno=alumno.getAsignaturas();//Recorremos el array de asignaturas para sacar su nombre y su nota
			int numAsignaturasAlumno=asignaturasAlumno.length; //este
			totalAsignaturas+=numAsignaturasAlumno;//este para mostrar las asignaturas que hay en total
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumnos+=asignatura.getNota();
			}
		}
		System.out.println("La nota media de todos los alumnos es: "+ notasAlumnos/totalAsignaturas); //como son string lo q va despues de la + lo concatena
		//Los operadores de dividir y mul siempre prevalecen , ej 7+8/9 hara primero la division , si queremos la + primero usamos ()
		
		//Indicar que alumno tiene la nota media mas alta
		double notaMediaMasAlta=0;
		Alumno alumnoNotaMediaMasAlta=null;
		for (Alumno alumno : alumnos) {
			double notasAlumno=0;
			Asignatura[] asignaturasAlumno=alumno.getAsignaturas();//Recorremos el array de asignaturas para sacar su nombre y su nota
			int numAsignaturasAlumno=asignaturasAlumno.length; //este
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumno+=asignatura.getNota();
			}
			
			double mediaAlumno=notasAlumno/numAsignaturasAlumno; 
			if (mediaAlumno>notaMediaMasAlta) {
				notaMediaMasAlta=mediaAlumno;
				alumnoNotaMediaMasAlta=alumno;
			}
			//System.out.println("La notas del alumno1 son: ");
		//System.out.println(alumnos[1].getAsignaturas()[1].getNota());
			}
		System.out.println("El alumno con la media mas alta es: "+alumnoNotaMediaMasAlta.getNombre()+" con un " +notaMediaMasAlta);	
	}

}
