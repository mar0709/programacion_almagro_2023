package edu.ucjc.informaticajavaucjc.bucles;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While primero evalua y luego ejecuta
		int num=4;
		while(num<-4) {
			System.out.println(num);
			num++;
		}
		
		//Do While primero ejecuta y luego evalua
		do {
				System.out.println(num); //5
		}while(num>3); //si por lo que saldria bucle infinito
	}

}
