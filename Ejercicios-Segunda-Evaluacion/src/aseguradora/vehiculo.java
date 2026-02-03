package aseguradora;

import java.time.LocalDate;

abstract class vehiculo {
	protected String matricula;
	protected int anioFabricacion;
	protected conductor conductorAsociado;
	
	public vehiculo (String matricula, int anioFabricacion, conductor conductorAsociado) {
		this.matricula = matricula;
		this.anioFabricacion = anioFabricacion;
		this.conductorAsociado = conductorAsociado;
	}
	
	public double getSeguro() {
		double seguro = 0;
		return seguro;
	}
}
