package carreradecoches;

public class Carerra {
	private String nombre;
	private String circuito;
	private Coche parrilaSalida;
	private double distancia;
	
	public Carerra(String nombre, String circuito, Coche parrilaSalida, double distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrilaSalida = parrilaSalida;
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public Coche getParrilaSalida() {
		return parrilaSalida;
	}

	public void setParrilaSalida(Coche parrilaSalida) {
		this.parrilaSalida = parrilaSalida;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	 public void iniciarCarrera();
	 	if avance>distancia {
	 		coche1.correr();
	 		
	 	}
	
	
}
