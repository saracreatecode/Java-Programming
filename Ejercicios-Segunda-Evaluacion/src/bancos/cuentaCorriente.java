package bancos;

public class cuentaCorriente {
	private cliente titular1Asociado;
	private cliente titular2Asociado = null;
	private double saldo;
	private sucursal sucursalCreacion;
	private String codigo; // codigo banco, codigo sucursal y cdigo cuenta
	
	public cuentaCorriente(cliente titular1Asociado, double saldo, sucursal sucursalCreacion, String codigo) {
		this.titular1Asociado = titular1Asociado;
		this.saldo = saldo;
		this.sucursalCreacion = sucursalCreacion;
		this.codigo = codigo;
		
		this.titular1Asociado.aniadeCuenta(this);
		this.sucursalCreacion.aniadeCuenta(this);
	}
	
	public cuentaCorriente(cliente titular1Asociado, cliente titular2Asociado, double saldo, sucursal sucursalCreacion, String codigo) {
		this.titular1Asociado = titular1Asociado;
		this.titular2Asociado = titular2Asociado;
		this.saldo = saldo;
		this.sucursalCreacion = sucursalCreacion;
		this.codigo = codigo;
		
		this.titular1Asociado.aniadeCuenta(this);
		this.titular2Asociado.aniadeCuenta(this);
		this.sucursalCreacion.aniadeCuenta(this);
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getIBAN() {
		return sucursalCreacion.getCodigoBancoYSucursal() + " " + this.codigo;
	}
	
	public void mostrar() {
		System.out.println("CUENTA CORRIENTE INFO-----------");
		System.out.println("Titular: " + titular1Asociado.getNif());
		if (this.titular2Asociado == null) {
			System.out.println("Co-titular: No tiene co-titular");
		} else {
			System.out.println("Co-titular: " + titular2Asociado.getNif());
		}
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Sucursal donde se creó: " + sucursalCreacion.getNombre());
		System.out.println("IBAN: " + this.getIBAN());
		System.out.println("--------------------------------");
	}

}
