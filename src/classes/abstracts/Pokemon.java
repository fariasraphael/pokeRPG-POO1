package classes.abstracts;

import classes.sistema.Elemento;
import classes.sistema.Golpe;

public abstract class Pokemon {
    private String nome;
    private Elemento elemento;
    private int vida ;
    private int level;
    private boolean reviveu;
    private Golpe[] golpes;

    public abstract int ataca(Golpe golpe);

    public void descansa() {
        for (int i = 0; i < golpes.length; i++) {
            Golpe golpe = golpes[i];
            if (golpe.getUsos() < golpe.getMaxUsos()) {
                golpe.setUsos(golpe.getUsos()+1);
            }
            golpes[i] = golpe;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isReviveu() {
        return reviveu;
    }

    public void setReviveu(boolean reviveu) {
        this.reviveu = reviveu;
    }

    public Golpe[] getGolpes() {
        return golpes;
    }

    public void setGolpes(Golpe[] golpes) {
        this.golpes = golpes;
    }
}
