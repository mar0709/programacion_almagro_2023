package edu.ucjc.informaticajavaucjc.bucles;

public class conmetodomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sinmetodomain sinmetodomain1 =new sinmetodomain();
		sinmetodomain1.nombre="Mariad";
		
		sinmetodomain sinmetodomain2=sinmetodomain1;
		sinmetodomain2.nombre="Maria";
		sinmetodomain2.correr();
		System.out.println(sinmetodomain1.nombre);
		
		sinmetodomain sinmetodomain3= new sinmetodomain ();
		sinmetodomain3.nombre="Eva";
		System.out.println(sinmetodomain3.nombre);
		sinmetodomain3.correr();
		sinmetodomain2=sinmetodomain3;
		sinmetodomain3=null;
		System.out.println(sinmetodomain2.edad);
	}

}
