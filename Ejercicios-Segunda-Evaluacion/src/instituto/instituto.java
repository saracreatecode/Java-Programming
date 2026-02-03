package instituto;

public class instituto {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Mario", "Carcalete", 17);
		Alumno alumno2 = new Alumno("Andrea", "Coronado", 24);
		Alumno alumno3 = new Alumno("Sara", "García Martín", 19);

		Profesor profe1 = new Profesor("Jose María", "Apellidos", "Empresa");
		Profesor profe2 = new Profesor("Natalia", "Apellidos", "Empresa");

		Modulo programacion = new Modulo("Programación", 1, 8, false);
		Modulo python = new Modulo("Python", 1, 2, true);
		Modulo fundamentos = new Modulo("Fundamentos", 1, 2, true);

		Ciclo dam = new Ciclo("Desarrollo de Aplicaciones Multiplataforma", "SUPERIOR");
		dam.aniadeModulo(programacion);
		dam.aniadeModulo(fundamentos);
		dam.aniadeModulo(python);

		Grupo dam1 = new Grupo("DAM1", dam, 1, 28);
		dam1.aniadeTutor(profe2);
		dam1.aniadeAlumno(alumno1);
		dam1.aniadeAlumno(alumno2);
		dam1.aniadeAlumno(alumno3);

		dam1.verGrupo();
	}
}