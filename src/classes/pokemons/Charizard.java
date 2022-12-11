package classes.pokemons;

import classes.sistema.Golpe;

import java.util.Random;

public class Charizard extends Charmeleon {

    public Charizard(String nome) {
        super(nome);
        super.setVida(super.getVida() + (new Random().nextInt(300) + 200));
        System.out.printf("Criando um novo %s\n", this);
    }

    @Override
    public int ataca(Golpe golpe) {
        return 0;
    }
}
