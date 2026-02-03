package instituto;

public class Profesor extends Persona {
	private String departamento = null;
	private Grupo tutoria = null;

	public Profesor(String nom, String ape, String departamento) {
		super(nom, ape);
		if (!departamento.equalsIgnoreCase("Informática") && !departamento.equalsIgnoreCase("Empresa") && !departamento.equalsIgnoreCase("Inglés")) {
			System.out.println("ERROR: Departamento no válido");
		} else {
			this.departamento = departamento.toUpperCase();
		}
	}

	public void setTutoria(Grupo grupo) {
		this.tutoria = grupo;
	}
}