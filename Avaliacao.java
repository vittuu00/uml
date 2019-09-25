package academico;

public class Avaliacao {

	public float nota;
	public float peso;
	protected Professor prof;
	protected Matricula matricula;
	
	public Avaliacao() {
		prof = new Professor();
		matricula = new Matricula();
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
}
