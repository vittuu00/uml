
package votacao;


public class Validacao {
    private String hash;
    private boolean ativo;
    protected Usuario usuario;
    protected Votacao votacao;
    
    public Validacao() {
        usuario = new Usuario();
        votacao = new Votacao();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Validacao{" + "hash=" + hash + ", ativo=" + ativo + ", usuario=" + usuario + ", votacao=" + votacao + '}';
    }
    
}