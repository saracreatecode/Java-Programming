package bancos;

import java.util.ArrayList;

public class banco {
	private String nombre;
	private String codigo;
	ArrayList<sucursal> sucursalesAsociadas = new ArrayList<>();
	
	public banco (String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public void mostrar() {
		System.out.println("BANCO INFO----------------------");
		System.out.println("Nombre de banco: " + this.nombre);
		System.out.println("Código: " + this.codigo);
		System.out.println("--------------------------------");
	}

	public void nuevaSucursal(sucursal sucursal) {
		this.sucursalesAsociadas.add(sucursal);
	}
	
	public void listarSucursales() {
		System.out.println("Banco: " + this.nombre + " / Código: (" + this.codigo + ")");
		for (sucursal sucursalesAsociadas : sucursalesAsociadas) {
			System.out.println("- " + sucursalesAsociadas.getNombre() + " (" + sucursalesAsociadas.getCodigo() + ")");
		}
		System.out.println("--------------------------------");
	}
}
