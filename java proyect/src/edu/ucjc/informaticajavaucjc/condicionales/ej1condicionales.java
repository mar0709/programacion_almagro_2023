package edu.ucjc.informaticajavaucjc.condicionales;

import java.util.Scanner;

public class ej1condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes="Enero";
		Scanner scan= new Scanner (System.in);
		System.out.println("Escribe el nombre del mes:");
		mes=scan.nextLine();
		System.out.println("Mes introducido: "+mes);
			
		//Realizamos con el if
		String estacion="";
		String mesFebrero= "Febero";
		if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase(mesFebrero) || mes.equalsIgnoreCase("Marzo")) {
			estacion="Invierno";
		}else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
			estacion="Primeavera";
		}else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto")|| mes.equalsIgnoreCase("Septiembre")) {
			estacion="Verano";
		}else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre")|| mes.equalsIgnoreCase("Diciembre")) {
			estacion="Invierno";
		}
		else {
			estacion="erronea";
		}
		System.out.println("La estacion del mes "+mes +" es "+estacion);
		
		//SWITCH
		switch (mes.toLowerCase() ) {
			case "Enero":
			case "Febrero":
			case "Marzo": System.out.println("Invierno"); break;
			case "abril":
			case "mayo":
			case "junio": System.out.println("Primavera");break;
			case "Julio":
			case "Agosto":
			case "Septiembre": System.out.println("Verano");break;
			case "octubre":
			case "noviembre":
			case "diciembre":System.out.println("Otoño");break;
			
			default: System.out.println();
		}
			
		}
			
		
		}

