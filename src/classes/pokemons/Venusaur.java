package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;

public class Venusaur extends Ivysaur{
    public Venusaur (String nome) {
        super(nome);
        this.setLevel(3);
    }

    @Override
    public Venusaur evolui() {
        return null;
    }
}
