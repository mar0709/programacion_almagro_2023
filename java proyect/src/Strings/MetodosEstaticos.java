package Strings;

public class MetodosEstaticos {
	
	static String dato = "dato1";
	
	public static void metodo1 () {
		System.out.println("Metodo1 estático");
		metodo2();
		
	}
	
	public static void metodo2 () {
		dato = "Hola";
		System.out.println("Metodo2 estático");
	}
	
	public void metodo3() {
		metodo1();
		System.out.println("Metodo2 no estático");
	}
	
	public void metodo3(int num) { //En java no se acepta valores por defecto tipo int num=0
		if(num==0) {
			metodo1();
		}else {
			System.out.println(num);
		}
	}
	//public void metodo3(String texto) {
	//	System.out.println(texto);
	//}
}
