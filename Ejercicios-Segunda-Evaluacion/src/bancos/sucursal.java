package bancos;

import java.util.ArrayList;

public class sucursal {
	private banco bancoAsociado;
	private String calle;
	private int numero;
	private String ciudad;
	private int codigoPostal;
	private String codigo;
	ArrayList<cliente> clientesDeAlta = new ArrayList<>();
	ArrayList<cuentaCorriente> cuentasDeAlta = new ArrayList<>();
	
	public sucursal (banco bancoAsociado, String calle, int numero, String ciudad, int codigoPostal, String codigo) {
		this.bancoAsociado = bancoAsociado;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.codigo = codigo;
		bancoAsociado.nuevaSucursal(this);
	}
	
	public String getNombre() {
		return this.ciudad;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getCodigoBancoYSucursal() {
		return bancoAsociado.getCodigo() + " " + this.codigo;
	}
	
	public void aniadeCliente(cliente cliente) {
		clientesDeAlta.add(cliente);
	}
	
	public void aniadeCuenta(cuentaCorriente cuentaCorriente) {
		cuentasDeAlta.add(cuentaCorriente);
	}
	
	public void listarClientesDeSucursal() {
		System.out.println("Sucursal (Clientes Asociados): " + this.ciudad + " / Código: (" + this.codigo + ")");
		for (cliente clientesDeAlta : clientesDeAlta) {
			System.out.println("- " + clientesDeAlta.getNombre() + ", " + clientesDeAlta.getApellidos() + " (" + clientesDeAlta.getNif() + ")");
		}
		System.out.println("--------------------------------");
	}
	
	public void listarCuentasDeSucursal() {
		System.out.println("Sucursal (Cuentas Asociadas): " + this.ciudad + " / Código: (" + this.codigo + ")");
		for (cuentaCorriente cuentasDeAlta : cuentasDeAlta) {
			System.out.println("- " + cuentasDeAlta.getIBAN() + " / Saldo: " + cuentasDeAlta.getSaldo());
		}
		System.out.println("--------------------------------");
	}
	
	public void mostrar() {
		System.out.println("SUCURSAL INFO-------------------");
		System.out.println("Banco al que pertenece: " + bancoAsociado.getNombre());
		System.out.println("Calle: " + this.calle);
		System.out.println("Número: " + this.numero);
		System.out.println("Ciudad: " + this.ciudad);
		System.out.println("Código postal: " + this.codigoPostal);
		System.out.println("Código de sucursal: " + this.codigo);
		System.out.println("--------------------------------");
	}



}
