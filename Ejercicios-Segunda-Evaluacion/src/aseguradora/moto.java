package aseguradora;


public class moto extends vehiculo {
	public moto(String matricula, int anioFabricacion, conductor conductorAsociado) {
		super(matricula, anioFabricacion, conductorAsociado);
	}
	
	public void motoMostrar() {
		System.out.println("--- DATOS DE MOTO ---");
		System.out.println("Matrícula de MOTO: " + this.matricula);
		System.out.println("Año de fabricación: " + this.anioFabricacion);
		System.out.println("Conductor asociado: " + conductorAsociado.getNif());
	}
}
