
package votacao;


public class Voto {
    protected Votacao votacao;
    
    public Voto() {
        votacao =  new Votacao();
    }

    @Override
    public String toString() {
        return "Voto{" + "votacao=" + votacao + '}';
    }
    
}
