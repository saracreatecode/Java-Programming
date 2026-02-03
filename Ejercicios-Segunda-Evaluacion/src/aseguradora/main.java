package aseguradora;

public class main {
	public static void main(String[] args) {

		conductor conductor1 = new conductor("209520F", 1980, 14, 2000);
		conductor conductor2 = new conductor("209530J", 1990, 14, 2010);
		conductor conductor3 = new conductor("227520M", 2006, 14, 2024);
		conductor1.conductorMostrar();
		conductor2.conductorMostrar();
		conductor3.conductorMostrar();
		
		coche coche1 = new coche("1234F", 2007, conductor1);
		coche coche2 = new coche("5678M", 2015, conductor2);
		coche coche3 = new coche("9101A", 2000, conductor3);
		coche1.cocheMostrar();
		coche2.cocheMostrar();
		coche3.cocheMostrar();
		
		moto moto1 = new moto("1234J", 2003, conductor1);
		moto moto2 = new moto("5245V", 2023, conductor2);
		moto moto3 = new moto("9821S", 2009, conductor3);
		moto1.motoMostrar();
		moto2.motoMostrar();
		moto3.motoMostrar();
		
		coche1.seguroCoche();
	}
}