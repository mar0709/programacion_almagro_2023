package utils;

import java.util.Scanner;
import edu.ucjc.informaticajavaucjc.bucles.ValidarEmail; 


public class Utilidades {
	
	public static void pintarMenu() {
		
		System.out.println("Bienvenido al menu");
		System.out.println("1.Validar email");
		System.out.println("2.Pintar el cuadrado");
		System.out.println("3.Mostrar datos");
		System.out.println("4.Salir");
		pintarMenu("1.Validar email|2.Pintar el cuadrado|3.Mostrar datos|4.Salir");
	}
	public static void pintarMenu(String menu) {
		pintarMenu(menu,"\\|");
	}
	
	//public static void pintarMenu(String menu) { //Sobrecarga con String
		//"Opcion1|Opcion2|Opcion3"
		//String [] opciones=menu.split("\\|");
		//pintarMenu(opciones);
		//for (String opcion:opciones) {
		//	System.out.println(opcion);
		//}
		
	//}
	public static void pintarMenu(String menu,String caracter) { //Sobrecarga con String
		//"Opcion1|Opcion2|Opcion3"
		String [] opciones=menu.split("\\;");
		pintarMenu(opciones);
	
	}
	
	public static void pintarMenu(String[] menu) {
		for(String opcion:menu) {	//Recorre el menu
			System.out.println(opcion);
		}
	}
	
	public static String pideDatos(String mensaje) {
		String resultado="";
		System.out.println(mensaje);
		Scanner scan=new Scanner(System.in);
		resultado=scan.nextLine();
		
		return resultado;
	}
	
	public static void main(String[] args) {

		String email = "   asdsadh@dfge.es.esdsaf   ";
		
		email = email.trim();
		String mensajeError = "";
		
		//Validamos el email
		//El email debe contener solo una @
		if (email.indexOf("@")==-1) {
			mensajeError += "El email no tiene arroba. ";
		}else if (email.indexOf("@")!=email.lastIndexOf("@")) {
			mensajeError += "El email no puede tener más de una arroba. ";
		}else {
			//Después de la @ tiene que haber al menos un punto
			String dominio = email.substring(email.indexOf("@")+1);
			if (dominio.indexOf(".")==-1) {
				mensajeError += "Después de la @ debe haber al menos un punto. ";
			}else {
			
				int diferencia = dominio.length() - (dominio.lastIndexOf(".")+1);
				if (diferencia<2 || diferencia>6) {
					mensajeError += "Después del último punto solo puede haber "
							+ "entre 2 y 6 caracteres. ";
				}
			}
		}
}