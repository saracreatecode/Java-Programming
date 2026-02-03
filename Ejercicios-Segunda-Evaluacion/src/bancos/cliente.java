package bancos;

import java.util.ArrayList;

public class cliente {
	private String nombre;
	private String apellidos;
	private String nif;
	private int telefono;
	private sucursal sucursalAsociada;
	ArrayList<cuentaCorriente> cuentasAsociadas = new ArrayList<>();
	
	
	public cliente (String nombre, String apellidos, String nif, int telefono, sucursal sucursalAsociada) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.telefono = telefono;
		this.sucursalAsociada = sucursalAsociada;
		this.sucursalAsociada.aniadeCliente(this);
	}
	
	public void aniadeCuenta(cuentaCorriente cuentaCorriente) {
		cuentasAsociadas.add(cuentaCorriente);
	}
	
	public String getNif() {
		return this.nif;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void listarCuentas() {
		System.out.println("Cliente: " + this.nombre + ", " + this.apellidos + " (" + this.nif + ")");
		for (cuentaCorriente cuentasAsociadas : cuentasAsociadas) {
			System.out.println("- " + cuentasAsociadas.getIBAN() + " / Saldo: " + cuentasAsociadas.getSaldo());
		}
		System.out.println("--------------------------------");
	}
	
	public void mostrar() {
		System.out.println("CLIENTE INFO--------------------");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("NIF: " + this.nif);
		System.out.println("Teléfono: " + this.telefono);
		System.out.println("Sucursal Asociada: " + sucursalAsociada.getNombre());
		System.out.println("--------------------------------");
	}
}
