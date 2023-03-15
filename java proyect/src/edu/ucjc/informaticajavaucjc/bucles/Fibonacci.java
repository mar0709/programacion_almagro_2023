package edu.ucjc.informaticajavaucjc.bucles;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int primerNumero=0,segundoNumero=1,tercerNumero,n;
			System.out.println("Introduce un numero:");
			n= teclado.nextInt();
		for(int i=0; i<n ; i++) {
			System.out.print(","+primerNumero);
			tercerNumero=primerNumero+segundoNumero;
			primerNumero=segundoNumero;
			segundoNumero=tercerNumero;
		}
	}
}
