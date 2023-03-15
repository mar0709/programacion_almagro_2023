package arrays;

public class ArraysDatosConocidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] colores = {"Rojo","Amar","Verde"};
		String [] [] alumnosAula=({"a1","a2","a3"},{"b1","b"}) ;
				
		System.out.println( colores.length);
		System.out.println(colores[2]);
		System.out.println("===========");
		//Recorremos arrays con for
		 for (int i=0; i<colores.length;i++) {
			 System.out.println(colores[i]);
		 }
		System.out.println("=============");
	}

}
