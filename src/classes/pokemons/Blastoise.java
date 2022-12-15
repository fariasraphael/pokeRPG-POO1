package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;

import java.util.Random;

public class Blastoise extends Wartortle {

    public Blastoise(String nome) {
        super(nome);
        this.setLevel(3);
        //System.out.printf("Criando um novo %s\n", this);
    }



    @Override
    public Blastoise evolui() {
        return null;
    }
}