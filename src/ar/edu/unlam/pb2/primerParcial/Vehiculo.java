package ar.edu.unlam.pb2.primerParcial;

public class Vehiculo {
	private String marca;
	private String modelo;
	private Double precio;
	private Fabricante fabricante;

	public Vehiculo(String marca, String modelo, Double precio, Fabricante fabricante) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
