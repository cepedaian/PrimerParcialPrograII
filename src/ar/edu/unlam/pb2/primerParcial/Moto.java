package ar.edu.unlam.pb2.primerParcial;

public class Moto extends Vehiculo {
	private Integer cilindrada;
	private Integer velocidadMaxima;
	private Integer velocidadActual;

	public Moto(String marca, String modelo, Double precio, Fabricante fabricante, Integer cilindrada,
			Integer velocidadMaxima, Integer velocidadActual) {
		super(marca, modelo, precio, fabricante);
		this.cilindrada = cilindrada;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
	}

	public void incrementarVelocidad() {
		if (velocidadActual < velocidadMaxima) {
			this.velocidadActual++;
		}
	}

	public void incrementarVelocidad(Integer velocidadActual) {
		if (velocidadActual < velocidadMaxima) {
			this.velocidadActual = velocidadActual;
		}
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(Integer velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

}
