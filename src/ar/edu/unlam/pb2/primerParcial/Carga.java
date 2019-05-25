package ar.edu.unlam.pb2.primerParcial;

public class Carga {

	private Integer peso;
	private String descripcion;

	public Carga(Integer peso, String descripcion) {
		this.peso = peso;
		this.descripcion = descripcion;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
