import classes.Itens.PedraDeEvolucao;
import classes.Itens.Revive;
import classes.abstracts.Pokemon;
import classes.sistema.Batalha;
import classes.sistema.Jogador;
import classes.sistema.NPC;
import classes.sistema.Statics;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Statics.inicializaStatics();
        Batalha batalha = new Batalha();

        int indexNPC = 0;
        int indexPokemonNPC = 0;

        Jogador jogador = new Jogador();
        batalha.listaNPC();

        NPC npc = batalha.getNPC(indexNPC);

        //
        Pokemon pokemonJogador = jogador.escolherPokemon();
        Pokemon pokemonNPC = npc.escolherPokemon(indexPokemonNPC);

        System.out.printf("\nPokemon inimigo => %s\n", pokemonNPC.getNome());

        boolean continuar = true;
        boolean turnoJogador = true;

        while (continuar) {
            System.out.printf("\nVida do seu Pokemon = %d", pokemonJogador.getVida());
            System.out.printf("\nVida Pokemon inimigo = %d\n\n", pokemonNPC.getVida());

            if (turnoJogador) {
                System.out.println("###= Escolha um golpe para atacar =###");
                int danoCalculado = jogador.escolherGolpe(pokemonJogador, pokemonNPC);
                int taxaAcerto = 50 + new Random().nextInt(50);
                //System.out.printf(" Dano calculado: %d",danoCalculado);
                System.out.print(" Taxa de acerto: " + taxaAcerto + "%");

                double taxaAcertoPercente = taxaAcerto / 100D;
                int danoFinal = (int) (danoCalculado * taxaAcerto / 100D);
                pokemonNPC.setVida(pokemonNPC.getVida() - danoFinal);
                System.out.printf(" Dano final: %d\n", danoFinal);
            } else {
                System.out.println("\n=== Inimigo ataca ===");
                int danoCalculado = npc.escolherGolpe(pokemonNPC, pokemonJogador);
                int taxaAcerto = 50 + new Random().nextInt(50);
                //System.out.printf(" Dano calculado: %d",danoCalculado);
                System.out.print(" Taxa de acerto: " + taxaAcerto + "%");

                double taxaAcertoPercente = taxaAcerto / 100D;
                int danoFinal = (int) (danoCalculado * taxaAcerto / 100D);

                pokemonJogador.setVida(pokemonJogador.getVida() - danoFinal);
                System.out.printf(" Dano final: %d\n", danoFinal);

            }

            if (pokemonJogador.getVida() <= 0) {
                pokemonJogador.setVida(0);
                System.out.println();
                System.out.println("--- Seu pokemon morreu :(");
                if (!pokemonJogador.isReviveu()) {
                    System.out.println("Revivendo Pokemon ...");
                    new Revive().usarItem(pokemonJogador);
                } else {
                    System.out.println("e não pode ser mais revivido");
                    pokemonJogador = jogador.escolherPokemon();
                    if (pokemonJogador == null) {
                        System.out.println("===== Vc perdeu ====");
                        continuar = false;
                    }
                }

            }

            if (pokemonNPC.getVida() <= 0) {
                pokemonNPC.setVida(0);
                System.out.println();
                System.out.println("--- Vc matou o pokemon inimigo ---");
                indexPokemonNPC++;

                if (indexPokemonNPC == 3 && indexNPC == 2) {
                    System.out.println(" ===== Parabéns vc GANHOU ====");
                    continuar = false;
                } else if (indexPokemonNPC == 3) {
                    System.out.printf("\n--- Vc ganhou de %s ---\n",npc.getName());
                    indexNPC++;

                    npc = batalha.getNPC(indexNPC);
                    System.out.printf("\nNovo inimigo -> %s\n",npc.getName());
                    indexPokemonNPC = 0;

                    //
                    pokemonJogador.setVida(0);
                    System.out.printf("\nPokemon %s evoluído\n",pokemonJogador.getNome());
                    pokemonJogador = new PedraDeEvolucao().usarItem(pokemonJogador);


                }

                if (indexPokemonNPC <= 2) {
                    pokemonNPC = npc.escolherPokemon(indexPokemonNPC);
                    System.out.printf("\nNovo Pokemon inimigo => %s\n", pokemonNPC.getNome());
                }

                turnoJogador = !turnoJogador;
            }

            turnoJogador = !turnoJogador;

        }

        ////


    }

}