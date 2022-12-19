package classes.sistema;

import classes.abstracts.Pokemon;
import classes.abstracts.Treinador;

public class NPC extends Treinador {

    public NPC(String name) {
        super.setName(name);
    }

    @Override
    public Pokemon escolherPokemon() {
        return null;
    }

    @Override
    protected void escolherItem() {

    }

    @Override
    protected int escolherGolpe(int indexPokemonAtual, Pokemon pokemonInimigo) {
        return 0;
    }

    @Override
    public void escolherAcao(int indexPokemonAtual, Pokemon pokemonInimigo) {

    }
}
