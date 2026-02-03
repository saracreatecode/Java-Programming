package protectora;

public class main {
	public static void main(String[] args) {
		
		cliente cliente1 = new cliente("Sara", "García Martín", 19, 111111111, "perro");
		cliente cliente2 = new cliente("Sergio", "Serrano Arroyo", 21, 222222222, "gato");
		cliente1.mostrarCliente();
		cliente2.mostrarCliente();
		
		perro perro1 = new perro(2020, "Russa", "si");
		perro perro2 = new perro(2019, "no");
		perro1.mostrarPerro();
		perro2.mostrarPerro();
		
		gato gato1 = new gato(2024, "Michi", "si");
		gato gato2 = new gato(2025, "no");
		gato1.mostrarGato();
		gato2.mostrarGato();
		
		tortuga tortuga1 = new tortuga(2000, "Tortuga", "terrestre");
		tortuga tortuga2 = new tortuga(1990, "actuatica");
		tortuga1.mostrarTortuga();
		tortuga2.mostrarTortuga();
		
		cliente1.adoptaPerro(perro1);
		
	}
}