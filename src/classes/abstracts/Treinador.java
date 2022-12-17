package classes.abstracts;

import classes.sistema.Golpe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Treinador {
    private String name;
    private List<Pokemon> pokemons = new ArrayList<>();
    private List<Item> itens = new ArrayList<>();

    public abstract Pokemon escolherPokemon ();
    protected abstract void escolherItem ();
    protected abstract int escolherGolpe(int indexPokemonAtual, Pokemon pokemonInimigo);
    protected void descansar(int indexPokemonAtual) {
        this.getPokemons().get(indexPokemonAtual).descansa();
    }

    public abstract void escolherAcao(int indexPokemonAtual, Pokemon pokemonInimigo);

    protected void realizaAcao(int indexAcao, int indexPokemonAtual, Pokemon pokemonInimigo) throws IOException {
        switch (indexAcao) {
            case 0:
                escolherPokemon();
                break;
            case 1:
                escolherItem();
                break;
            case 2:
                System.out.println("Dano causado: " + escolherGolpe(indexPokemonAtual, pokemonInimigo));
                break;
            case 3:
                descansar(indexPokemonAtual);
                break;
            default:
                throw new IOException("Ação " + indexAcao + " selecionada inválida.");
        }
    }

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