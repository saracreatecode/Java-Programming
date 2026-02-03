package inventarioPersonaje;

import java.util.ArrayList;

public class Personaje {
	private String nombre;
	ArrayList<Accesorio> InventarioAccesorios = new ArrayList<>();

	public Personaje(String nombre) {
		this.nombre = nombre;
	}

	public void anyadirObjeto(Accesorio accesorio) {
		boolean repetido = false;
		for (Accesorio a : InventarioAccesorios) {
			if (a.getNombre().equals(accesorio.getNombre())) {
				repetido = true;
			}
		}
		if (repetido == true) {
			System.out.println("Error: el accesorio '" + accesorio.getNombre() + "' ya está en el inventario.");
		} else if (InventarioAccesorios.size() < 10) {
			InventarioAccesorios.add(accesorio);
		} else {
			System.out.println("Un personaje no puede tener asociados más de 10 accesorios");
		}
	}
	
	public void agotarAccesorio(Accesorio accesorio) {
		boolean eliminado = false;
		for (int i = 0; i < InventarioAccesorios.size(); i++) {
			if (InventarioAccesorios.get(i).getNombre().equals(accesorio.getNombre())) {
				InventarioAccesorios.remove(i);
				eliminado = true;
			}
		}
		if (eliminado == true) {
			System.out.println("El accesorio '" + accesorio.getNombre() + "' se ha agotado y ha sido eliminado.");
		} else {
			System.out.println("El accesorio '" + accesorio.getNombre() + "' no está en el inventario.");
		}
	}
	
	public void mostrarPersonaje() {
		System.out.println("Nombre del personaje: " + this.nombre);
		System.out.println("Accesorios: ");
		for (Accesorio accesorio:InventarioAccesorios) {
			System.out.println("Nombre: " + accesorio.getNombre());
			System.out.println("Valor en oro: " + accesorio.getValorEnOro());
		}
		System.out.println("-----------------------------------");
	}

}
