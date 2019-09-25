
package votacao;


public class Candidato {
    protected Usuario cargo;
    
    public Candidato() {
        cargo = new Usuario();
    }

    @Override
    public String toString() {
        return "Candidato{" + "cargo=" + cargo + '}';
    }
    }
