package carreradecoches;

public class Coche {
	private String escuderia;
	private String motor;
	private int numero;
	private Piloto piloto;
	private double velocidad;
	private double avance;
	
	public Coche(String escuderia, String motor, int numero, Piloto piloto, double velocidad,double avance) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
		this.avance=avance;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getAvance() {
		return avance;
	}

	public void setAvance(double avance) {
		this.avance = avance;
	}
	 public void Correr() {
		 avance++;//Aumente el valor de avance
	 }
	
}
