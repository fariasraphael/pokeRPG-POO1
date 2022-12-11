package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Charmeleon extends Charmander {

    public Charmeleon(String nome) {
        super(nome);
        super.setVida(super.getVida() + (new Random().nextInt(200) + 100));
        System.out.printf("Criando um novo %s\n", this);
    }

    @Override
    public int ataca(Golpe golpe) {
        return 0;
    }
}
