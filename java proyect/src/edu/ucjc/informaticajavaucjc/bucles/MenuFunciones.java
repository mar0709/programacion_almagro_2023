package edu.ucjc.informaticajavaucjc.bucles;

import java.util.Scanner;
import utils.Utilidades;

public class MenuFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int opcion=0;
		Scanner sb=new Scanner(System.in);
		int lado=0;
		Scanner sa=new Scanner (System.in);
		String email= "s";
		

		while(opcion!=4) {
			
			//Utilidades.pintarMenu();
			//String menu="Opcion1|Opcion2|Opcion3|Salir";
			//String menu2="Opcion1;Opcion2;Opcion3;Salir";
			//Utilidades.pintarMenu(menu);
			Utilidades.pintarMenu("Opcion1|Opcion2|Opcion3|Salir",";");
			//System.out.println("Introduce una opcion: ");
			//opcion=sc.nextInt();
			opcion=Integer.parseInt(Utilidades.pideDatos("Elige una opcion:"));
		
			
		switch(opcion) {
			case 1 :
				System.out.println("Introduce tu email:");
				email=sa.next();
					System.out.println("Su email es:"+email);
				break;
			case 2:
				System.out.println(("Introduce el lado del cuadrado:"));
				lado=sb.nextInt();
				for(int i=0;i<lado;i++) {
					for(int j=0;j<lado;j++) {
						if(i==0 || i==lado-1 ) {
							System.out.print("*");
							if(j==lado-1) {
								System.out.println();
							}else {
								System.out.print(" ");
							}
						}else if (j==0 || j==lado -1) {
							System.out.print("*");
							if (j==lado-1) {
								System.out.println();
							}else {
								System.out.print("  ");
							}
						}else {
							System.out.print("  ");
						}
					}
				}
				break ; 
			case 3:
				System.out.println("Ha eleigido la opcion 3");
				break;
			case 4:
				System.out.println("Saliendo del menu");
				break;
			default:
				System.out.println("Opcion invalida");
		}
		}
	}

}
