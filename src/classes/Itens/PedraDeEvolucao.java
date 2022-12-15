package classes.Itens;

import classes.abstracts.Item;
import classes.abstracts.Pokemon;

public class PedraDeEvolucao extends Item {

    @Override
    public Pokemon usarItem(Pokemon pokemon) {
        Pokemon evolucao = pokemon.evolui();
        if (evolucao != null) {
            return evolucao;
        }
        throw new Error ("Seu pokemon já está na sua evolução máxima");
    }
}