package classes.sistema;

public class Golpe {
    private String nome;
    private int dano;
    private int maxUsos;
    private int usos;
    private Elemento tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getMaxUsos() {
        return maxUsos;
    }

    public void setMaxUsos(int maxUsos) {
        this.maxUsos = maxUsos;
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }

    public Elemento getTipo() {
        return tipo;
    }

    public void setTipo(Elemento tipo) {
        this.tipo = tipo;
    }
}
