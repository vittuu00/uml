package academico;

import javax.xml.crypto.Data;

public class Frequencia {

	public Data data;
	public int aulas;
	public int faltas;
	protected Professor prof;
	protected Matricula matricula;

	public Frequencia() {
	
		prof = new Professor();
		matricula = new Matricula();
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public int getAulas() {
		return aulas;
	}

	public void setAulas(int aulas) {
		this.aulas = aulas;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
}
