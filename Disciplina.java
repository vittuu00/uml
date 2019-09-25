package academico;

public class Disciplina {

	public String nome;
	protected Fase fase;
	
	public Disciplina() {
		fase = new Fase();	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
