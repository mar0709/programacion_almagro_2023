package arrays;

import java.util.Scanner;

public class ArraysDatosDesconocidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] numeros=new int [2] [3];
		numeros [1] [1]=0;
		System.out.println(numeros[1] [1]);
		System.out.println("Numero de columnas"+numeros.length);
		System.out.println("Numero de filas"+numeros[1].length);
		
		//Mostramos los datos de la matriz 
		for (int i=0; i< numeros.length;i++) {
			for(int j=0; j<numeros[i].length; j++) {
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
		
		//Asignamos datos a la matriz
		for (int i=0; i< numeros.length;i++) {
			for(int j=0; j<numeros[i].length; j++) {
				Scanner scan=new Scanner(System.in);
				System.out.println("Introduce el valor de la posicion ["+i+"],["+j+"]");
				numeros[i][j]=scan.nextInt();
				scan.nextInt();
			}
			System.out.println();
		}
		
		for (int i=0; i< numeros.length;i++) {
			for(int j=0; j<numeros[i].length; j++) {
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
		
			}
	
		}
	
