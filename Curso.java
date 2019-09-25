package academico;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	public String nome;
	protected List<Aluno> aluno;
	
	public Curso(){
		aluno = new ArrayList<Aluno>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
