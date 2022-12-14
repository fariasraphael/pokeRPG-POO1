package classes.abstracts;

import classes.sistema.Elemento;
import classes.sistema.Golpe;

import java.util.Arrays;

public abstract class Pokemon {
    private String nome;
    private Elemento elemento;
    private int vida;
    private int vidaMaxima;
    private int level;
    private boolean reviveu;
    private Golpe[] golpes = new Golpe[4];

    public Pokemon(String nome, Elemento elemento, int vida) {
        this.nome = nome;
        this.elemento = elemento;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.level = 1;
        this.reviveu = false;
    }

    public abstract int ataca(Golpe golpe, Pokemon pokemonInimigo);

    public abstract Pokemon evolui();

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

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
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

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "nome='" + nome + '\'' +
                ", elemento=" + elemento +
                ", vida=" + vida +
                ", level=" + level +
                ", reviveu=" + reviveu +
                ", golpes=" + Arrays.toString(golpes) +
                '}';
    }
}