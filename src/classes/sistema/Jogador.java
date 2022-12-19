package classes.sistema;

import classes.abstracts.Item;
import classes.abstracts.Pokemon;
import classes.abstracts.Treinador;
import classes.pokemons.Bulbassaur;
import classes.pokemons.Charmander;
import classes.pokemons.Squirtle;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Jogador extends Treinador {
    private final static Scanner input = new Scanner(System.in);

    public Jogador() {
        escolheNome();
        escolhePokemonsIniciais();
    }

    private void escolhePokemonsIniciais() {
        System.out.printf("Bem vindo %s!\n" +
                "Você é o(a) mais novo(a) treinador(a) pokemon da região, parabéns!\n" +
                "Para começar sua jornada, você está recebendo 3 pokemons iniciais. Nomeie cada um deles.\n", this.getName());
        //input.nextLine();

        System.out.println("\nEscolha o nome do seu Charmander: ");
        this.getPokemons().add(new Charmander(validaNome()));
        System.out.println("Escolha o nome do seu Bulbassaur: ");
        this.getPokemons().add(new Bulbassaur(validaNome()));
        System.out.println("Escolha o nome do seu Squirtle: ");
        this.getPokemons().add(new Squirtle(validaNome()));

        System.out.println("\nAgora você já possui seus 3 pokemons iniciais. Boa sorte nas batalhas.\n");
//        input.nextLine();
    }

    private void escolheNome() {
        this.setName(validaNome());
    }

    private String validaNome() {
        while (true) {
            System.out.print("Digite o nome: ");
            String name = input.nextLine();
            System.out.printf("O nome %s está correto?\n\t0-Não;\n\t1-Sim;\nResposta: ", name);
            String resposta = input.nextLine();
            switch (resposta) {
                case "0":
                    break;
                case "1":
                    return name;
                default:
                    System.out.println("Resposta inválida.");
                    break;
            }
        }
    }

    @Override
    public Pokemon escolherPokemon() {
        if (this.getPokemons().isEmpty()){
            System.out.println("Jogador não possui Pokemons.");
            return null;
        }

        System.out.println("Escolha um dos seus pokemons para iniciar a batalha:");
        for (int i=0;i<this.getPokemons().size();i++){
            System.out.printf("%d - %s\n",i,this.getPokemons().get(i).getNome());
        }

        int indexPokemon = -1;
        while (indexPokemon == -1) {
            System.out.print("Seleção: ");
            String resposta = input.nextLine();
            try {
                indexPokemon = Integer.valueOf(resposta);
                if (indexPokemon < 0 || indexPokemon > getPokemons().size()) {
                    System.out.println("Resposta inválida!");
                    indexPokemon = -1;
                }
            } catch (Exception e){}

        }
            System.out.printf("%s escolhido\n",getPokemons().get(indexPokemon).getNome());
            return getPokemons().get(indexPokemon);



    }

    @Override
    public void escolherItem() {
        if (this.getItens().isEmpty()){
            System.out.println("Jogador não possui itens.");
            return;
        }

        Scanner input = new Scanner(System.in);

        List<Item> itens = this.getItens();
        for (int i = 0; i < itens.size(); i++) {
            System.out.printf("%d - Item: %s\n", i, itens.get(i).getClass().getSimpleName());
        }

        int indexItem = -1;
        while (indexItem == -1) {
            System.out.print("Seleção: ");
            String resposta = input.nextLine();
            try {
                indexItem = Integer.valueOf(resposta);
                if (indexItem < 0 || indexItem > itens.size()) {
                    System.out.println("Resposta inválida!");
                    indexItem = -1;
                }
            } catch (Exception e){}
        }

        List<Pokemon> pokemons = this.getPokemons();
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon pokemon = pokemons.get(i);
            System.out.printf("%d - %s: %s | Vida: %d/%d\n", i, pokemon.getClass().getSimpleName(), pokemon.getNome(), pokemon.getVida(), pokemon.getVidaMaxima());
        }

        int indexPokemon = -1;
        while (indexItem == -1) {
            System.out.print("Seleção: ");
            String resposta = input.nextLine();
            try {
                indexItem = Integer.valueOf(resposta);
                if (indexItem < 0 || indexItem > pokemons.size()) {
                    System.out.println("Resposta inválida!");
                    indexItem = -1;
                }
            } catch (Exception e){}
        }

        input.close();
        itens.get(indexItem).usarItem(pokemons.get(indexPokemon));
        itens.remove(indexItem);
    }

    @Override
    public int escolherGolpe(int indexPokemonAtual, Pokemon pokemonInimigo) {
        Scanner input = new Scanner(System.in);

        Pokemon pokemon = this.getPokemons().get(indexPokemonAtual);
        for (int i = 0; i < pokemon.getGolpes().length; i++) {
            Golpe golpe = pokemon.getGolpes()[i];
            System.out.printf("%d - Golpe: %s | Dano: %d | Tipo: %s | Usos: %d\n", i, golpe.getNome(), golpe.getDano(), golpe.getTipo().getNome(), golpe.getUsos());
        }

        int indexGolpe = -1;
        while (indexGolpe == -1) {
            System.out.print("Seleção: ");
            String resposta = input.nextLine();
            try {
                indexGolpe = Integer.valueOf(resposta);
                if (indexGolpe < 0 || indexGolpe > 3) {
                    System.out.println("Resposta inválida!");
                    indexGolpe = -1;
                }
            } catch (Exception e){}
        }

        input.close();
        return pokemon.ataca(pokemon.getGolpes()[indexGolpe], pokemonInimigo);
    }

    public int escolherGolpe(Pokemon pokemon, Pokemon pokemonInimigo) {
        System.out.println("\n");
        for (int i = 0; i < pokemon.getGolpes().length; i++) {
            Golpe golpe = pokemon.getGolpes()[i];
            System.out.printf("%d - Golpe: %s | Dano: %d | Tipo: %s | Usos: %d\n", i, golpe.getNome(), golpe.getDano(), golpe.getTipo().getNome(), golpe.getUsos());
        }

        int indexGolpe = -1;
        while (indexGolpe == -1) {
            System.out.print("Seleção: ");
            String resposta = input.nextLine();
            try {
                indexGolpe = Integer.valueOf(resposta);
                if (indexGolpe < 0 || indexGolpe > 3) {
                    System.out.println("Resposta inválida!");
                    indexGolpe = -1;
                }
            } catch (Exception e){}
        }

        return pokemon.ataca(pokemon.getGolpes()[indexGolpe], pokemonInimigo);
    }

    @Override
    public void escolherAcao(int indexPokemonAtual, Pokemon pokemonInimigo) {
        Scanner input = new Scanner(System.in);
        int indexAcao = -1;

        while (indexAcao == -1) {
            System.out.print("Seleção: ");
            String resposta = input.nextLine();
            try {
                indexAcao = Integer.valueOf(resposta);
                if (indexAcao < 0 || indexAcao > 3) {
                    System.out.println("Resposta inválida!");
                    indexAcao = -1;
                }
            } catch (Exception e){}
        }

        try {
            realizaAcao(indexAcao, indexPokemonAtual, pokemonInimigo);
        } catch (IOException ioException) {}
        input.close();
    }


}
