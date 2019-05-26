 package ar.edu.unlam.pb2.primerParcial;

public class Fabricante {
	private String nombre;
	private Direccion direccion;
	
	public Fabricante (String nombre,Direccion direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
