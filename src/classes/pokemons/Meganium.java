package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;

import java.util.Random;

public class Meganium extends Bayleef {

    public Meganium(String nome) {
        super(nome);
        this.setLevel(3);
        //System.out.printf("Criando um novo %s\n", this);
    }

    @Override
    public int ataca(Golpe golpe, Pokemon pokemonInimigo) {
        return 0;
    }

    @Override
    public Meganium evolui() {
        return this;
    }
}