package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;

import java.util.Random;

public class Golduck extends Psyduck {

    public Golduck(String nome) {
        super(nome);
        this.setLevel(2);
        //System.out.printf("Criando um novo %s\n", this);
    }


    @Override
    public Golduck evolui() {
        return null;
    }
}