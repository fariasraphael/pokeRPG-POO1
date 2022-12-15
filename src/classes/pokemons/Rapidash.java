package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;

import java.util.Random;

public class Rapidash extends Ponyta {

    public Rapidash(String nome) {
        super(nome);
        this.setLevel(2);
        //System.out.printf("Criando um novo %s\n", this);
    }


    @Override
    public Rapidash evolui() {
        return null;
    }
}



