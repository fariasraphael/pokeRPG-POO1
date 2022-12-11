package classes.sistema;

public class Elemento {
    private String nome;
    private Elemento fraqueza;
    private Elemento vantagem;

    public Elemento(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "nome='" + nome + '\'' +
                ", fraqueza=" + fraqueza.nome +
                ", vantagem=" + vantagem.nome +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Elemento getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(Elemento fraqueza) {
        this.fraqueza = fraqueza;
    }

    public Elemento getVantagem() {
        return vantagem;
    }

    public void setVantagem(Elemento vantagem) {
        this.vantagem = vantagem;
    }
}
