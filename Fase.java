package academico;

public class Fase {
	
	public int semestre;
	protected Curso curso;
	
	public Fase() {
		curso = new Curso();
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
}
