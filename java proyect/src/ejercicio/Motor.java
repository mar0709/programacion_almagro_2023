package ejercicio;

public class Motor {
	
	private String marca;
	private double num;
	private Piston piston;
	
	public Motor(String marca, double num, Piston piston) {
		super();
		this.marca = marca;
		this.num = num;
		this.piston = piston;
	}
	
	public Motor(String marca, double num) {
		super();
		this.marca = marca;
		this.num = num;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		 this.marca=marca;
	}
	
	public double getNum() {
		return num;
	}
	
	public void setNum(double num) {
		this.num=num;
	}
	public Piston getPiston() {
		return piston;
	}
	
	public void setPiston (Piston piston) {
		 this.piston=piston;
	}
	
	
}
