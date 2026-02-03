package bancos;

public class main {
	public static void main(String[] args) {
		banco banco = new banco("Creditos Informáticos", "ES68 1234");
		sucursal madrid = new sucursal (banco, "Calle del Pez", 5, "Madrid", 28032, "0078");
		sucursal sevilla = new sucursal (banco, "Calle Lanza", 7, "Sevilla", 41012, "9523");
		cliente cliente1 = new cliente ("Jose María", "Morales", "12345678P", 91327720, madrid);
		cliente cliente2 = new cliente("Sara", "García Martín", "87654321M", 11111111, madrid);
		cliente cliente3 = new cliente("Sergio", "Serrano Arroyo", "92754824F", 222222222, sevilla);
		cliente cliente4 = new cliente("Gabriel Alexandru", "Iacob", "14867125C", 333333333, sevilla);
		cliente cliente5 = new cliente("Jordan Daniel", "Moñiga", "87654353N", 444444444, madrid);
		cuentaCorriente cuenta1 = new cuentaCorriente (cliente1, 100.0, madrid, "112233445566");
		cuentaCorriente cuenta2 = new cuentaCorriente (cliente3, cliente4, 200.0, sevilla, "223344556677");
		
		cliente1.mostrar();
		madrid.mostrar();
		cuenta1.mostrar();
		cuenta2.mostrar();
		banco.mostrar();
		
		banco.listarSucursales();
		
		madrid.listarClientesDeSucursal();
		sevilla.listarClientesDeSucursal();
		madrid.listarCuentasDeSucursal();
		sevilla.listarCuentasDeSucursal();
		
		cliente1.listarCuentas();
		cliente3.listarCuentas();
		cliente4.listarCuentas();
	}
}