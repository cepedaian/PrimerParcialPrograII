package ar.edu.unlam.pb2.primerParcial;

public class Camion extends Vehiculo {

	private Integer numeroDeEjes;
	private Integer pesoMaximo;
	private Integer pesoDeCarga;
	private Boolean enMarcha;

	public Camion(String marca, String modelo, Double precio, Fabricante fabricante, Integer numeroDeEjes,
			Integer pesoMaximo, Integer pesoDeCarga, Boolean enMarcha) {
		super(marca, modelo, precio, fabricante);
		this.numeroDeEjes = numeroDeEjes;
		this.pesoMaximo = pesoMaximo;
		this.pesoDeCarga = pesoDeCarga;
		this.enMarcha = enMarcha;
	}

	public Boolean agregarCarga(Carga carga) {
		if (carga.getPeso() <= pesoMaximo) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean arrancar() {
		this.enMarcha = true;
		return true;
	}

	public void descargar() {
		this.pesoDeCarga = 0;
	}

	public Integer getNumeroDeEjes() {
		return numeroDeEjes;
	}

	public void setNumeroDeEjes(Integer numeroDeEjes) {
		this.numeroDeEjes = numeroDeEjes;
	}

	public Integer getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Integer getPesoDeCarga() {
		return pesoDeCarga;
	}

	public void setPesoDeCarga(Integer pesoDeCarga) {
		this.pesoDeCarga = pesoDeCarga;
	}

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}

}
