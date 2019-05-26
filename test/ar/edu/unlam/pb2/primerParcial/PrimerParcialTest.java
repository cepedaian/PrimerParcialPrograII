package ar.edu.unlam.pb2.primerParcial;

import org.junit.Assert;
import org.junit.Test;

public class PrimerParcialTest {

	@Test

	public void testQueVerifiqueLaCalleDelFabricanteDeUnVehiculo() {

		String valorEsperado = "garibaldi";
		String valorObtenido = "";

		Direccion miDireccion = new Direccion("garibaldi", 1715, "joseingeni");
		Fabricante miFabricante = new Fabricante("ian", miDireccion);
		Vehiculo miVehiculo = new Vehiculo("ferrari", "cupe", 200.0, miFabricante);

		valorObtenido = miVehiculo.getFabricante().getDireccion().getCalle();

		Assert.assertEquals(valorEsperado, valorObtenido);

	}

	@Test

	public void testQueVerifiqueArrancarUnCamion() {

		Boolean valorEsperado = true;
		Boolean valorObtenido;

		Direccion miDireccion = new Direccion("", 0, "");
		Fabricante miFabricante = new Fabricante("", miDireccion);
		Camion miCamion = new Camion("", "", 0.0, miFabricante, 0, 0, 0, true);

		valorObtenido = miCamion.arrancar();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test

	public void testQueDescargueTodasLasCargas() {
		Integer valorEsperado = 0;
		Integer valorObtenido;
		
		Direccion miDireccion = new Direccion("", 0, "");
		Fabricante miFabricante = new Fabricante("", miDireccion);
		Camion miCamion = new Camion("", "", 0.0, miFabricante, 0,0,200, true);
	
		miCamion.descargar();
		
		valorObtenido = miCamion.getPesoDeCarga();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

}
