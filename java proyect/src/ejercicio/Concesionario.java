package ejercicio;

public class Concesionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piston piston1=new Piston(1,"Marca1");
		Motor motor1=new Motor("MarcaMotor1",120,piston1);
		Volante volante1=new Volante(1,"Ligero","negro");
		Coche  coche1=new Coche ("Matricula1","Citroen",volante1,motor1);
		System.out.println(coche1.getMatricula());
		System.out.println(coche1.getVolante().getColor());
		System.out.println(coche1.getMotor().getPiston().getId());
		
		double velocidad= Math.random()*120;
		coche1.setVelocidad(velocidad);
		
		coche1.caracteristicas();
	}

}
