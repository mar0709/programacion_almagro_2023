package ejercicio;

import encapsulacion.Asignatura;

public class Coche {

	private String marca;
	private String matricula;
	private Motor motor;
	private Volante volante;
	private double velocidad;

	public Coche(String marca, String matricula, Motor motor, Volante volante,double velocidad) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.motor = motor;
		this.volante = volante;
		this.velocidad=velocidad;
	}

	// Constructor (me sirven para inicializar los atrib de las clases)

	public Coche(String marca, String matricula, Volante volante, Motor motor) {
		this.marca = marca;
		this.matricula = matricula;
	}

	public Coche(String marca, String matricula, Motor motor) {
		this.marca = marca;
		this.matricula = matricula;
		this.motor = motor;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Volante getVolante() {
		return this.volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}
	public double getVelocidad() {
		return this.velocidad;	
	}
	public void setVelocidad(double velocidad) {
		this.velocidad=velocidad;
	}

	// metodo o funciones
	
	public void caracteristicas() {
		System.out.println("El coche de  " + this.matricula + " va a una velocidad de" + this.velocidad);
	}

}
