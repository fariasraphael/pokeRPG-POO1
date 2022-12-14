package classes.Itens;

import classes.abstracts.Item;
import classes.abstracts.Pokemon;

public class PedraDeEvolucao extends Item {

    @Override
    public Pokemon usarItem(Pokemon pokemon) {
        return pokemon.evolui();
    }
}