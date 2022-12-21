package classes.sistema;

import classes.abstracts.Pokemon;
import classes.abstracts.Treinador;

import javax.management.relation.RelationNotFoundException;
import java.util.Random;

public class NPC extends Treinador {

    public NPC(String name) {
        super.setName(name);
    }

    @Override
    public Pokemon escolherPokemon() {
        //int indexPokemon = new Random().nextInt(2);
        int indexPokemon = 1;
        return getPokemons().get(indexPokemon);
    }

    public Pokemon escolherPokemon(int indexPokemon) {
        //int indexPokemon = new Random().nextInt(2);
        return getPokemons().get(indexPokemon);
    }

    @Override
    protected void escolherItem() {

    }

    @Override
    protected int escolherGolpe(int indexPokemonAtual, Pokemon pokemonInimigo) {
        return 0;
    }

    public int escolherGolpe(Pokemon pokemon, Pokemon pokemonInimigo) {
        int indexGolpe = new Random().nextInt(3);

        System.out.printf("Golpe: %s ",pokemon.getGolpes()[indexGolpe].getNome());
        return pokemon.ataca(pokemon.getGolpes()[indexGolpe], pokemonInimigo);
    }



    @Override
    public void escolherAcao(int indexPokemonAtual, Pokemon pokemonInimigo) {

    }
}
