package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Bulbassaur extends Pokemon {

    public Bulbassaur(String nome) {
        super(nome, Statics.getELEMENTO("grama"), new Random().nextInt(800, 900));
        System.out.printf("Criando um novo %s\n", this);
    }

    @Override
    public int ataca(Golpe golpe, Pokemon pokemonInimigo) {
        return 0;
    }

    @Override
    public Pokemon evolui() {
        return null;
    }
}
