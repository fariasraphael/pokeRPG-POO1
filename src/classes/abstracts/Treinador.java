package classes.abstracts;

import classes.sistema.Golpe;

import java.util.ArrayList;
import java.util.List;

public abstract class Treinador {
    private String name;
    private List<Pokemon> pokemons = new ArrayList<>();
    private List<Item> itens = new ArrayList<>();

    public abstract void escolherPokemon (Pokemon pokemon);
    public abstract void escolherItem (Item item);
    public abstract void escolherGolpe(int indexPokemonAtual);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}