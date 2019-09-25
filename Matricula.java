package academico;

public class Matricula {

	public int numero;
	protected Aluno aluno;
	protected DisciplinaLecionada disciplinaLecionada;
	
	public Matricula() {
		disciplinaLecionada =  new DisciplinaLecionada();
		aluno = new Aluno();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
