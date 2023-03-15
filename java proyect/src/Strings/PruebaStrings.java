package Strings;

public class PruebaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Caperucita Roja";
		
		nombre=nombre.toUpperCase();
		
		System.out.println(nombre);
		
		String lobo1="Lobo";
		String lobo2="Lobo";
		
		System.out.println(lobo1==lobo2);
		
		lobo2=nombre.toLowerCase();
		
		System.out.println(lobo1);
		System.out.println(lobo2);
		
		
		System.out.println();nombre.endsWith("ja");
		
		System.out.println(nombre.indexOf("A"));
		System.out.println(nombre.lastIndexOf("A"));
		
		System.out.println("       asd          asdads  ".trim());
		System.out.println("       asd          asdads  ".replace(" ",""));
		
		System.out.println(nombre.substring(3));
		
		
		int posicion=nombre.indexOf("ROJA");
		System.out.println(nombre.substring(posicion));
		//int posicion=nombre.indexOf(" ");
		//System.out.println(nombre.substring(posicion+1));
		//System.out.println(nombre.substring(posicion).trim());		
		
		
		String cadena="N1;A1;DN11;23;MDR";
		
		String [] valores=cadena.split(";");
		for(String valor:valores)
			System.out.println(valor);
	}

}
