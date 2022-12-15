package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;

import java.util.Random;

public class Sceptile extends Grovyle {

    public Sceptile(String nome) {
        super(nome);
        this.setLevel(3);
        //System.out.printf("Criando um novo %s\n", this);
    }



    @Override
    public Sceptile evolui() {
        return null;
    }
}