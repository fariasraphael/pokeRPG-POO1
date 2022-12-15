package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;

import java.util.Random;

public class Grotle extends Turtwig {

    public Grotle(String nome) {
        super(nome);
        this.setLevel(2);
        //System.out.printf("Criando um novo %s\n", this);
    }


    @Override
    public Grotle evolui() {
        return null;
    }
}

