package edu.ucjc.informaticajavaucjc.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1=10;
		int numero2=9;
		
		//Condiciones con if
		if(numero1>numero2) {
			System.out.println("Numero1 es mayor");
			System.out.println("-Numero1 es mayor");
		}else if (numero2>0) {
			System.out.println("Numero 2 es mayor de 0");
		}else {
			System.out.println("No se cumple ninguna condicion");
		}
		//Condiciones con switch(una unica variable)
	
		switch (numero1) {
			case 1:System.out.println("Valor1");
			case 2:System.out.println("Valor2");
			case 10:System.out.println("Valor10");
			default:
				System.out.println("El valor es distinto que el resto de casos");
				break;
		}
		}
}
