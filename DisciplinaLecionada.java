package academico;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaLecionada {

	public int ano;
	public int sem;
	protected List<Professor> prof;
	protected Disciplina disciplina;
	
	public DisciplinaLecionada() {
			prof = new ArrayList<Professor>();
			disciplina = new Disciplina();
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}	
}
