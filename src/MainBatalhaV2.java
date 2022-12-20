import classes.abstracts.Pokemon;
import classes.abstracts.Treinador;
import classes.sistema.Batalha;
import classes.sistema.Jogador;
import classes.sistema.NPC;
import classes.sistema.Statics;

import java.util.Random;

public class MainBatalhaV2 {
    public static void main(String[] args) {
        Statics.inicializaStatics();
        Batalha batalha = new Batalha();

        Jogador jogador = new Jogador();
        batalha.listaNPC();
        NPC npc = batalha.getNPC(0);

        //
        Pokemon pokemonJogador = jogador.escolherPokemon();
        Pokemon pokemonNPC = npc.escolherPokemon();

        System.out.printf("\nPokemon inimigo => %s\n",pokemonNPC.getNome());

        int jogar = 0;
        boolean turnoJogador = true;

        while (jogar < 10) {
            System.out.printf("\nVida do seu Pokemon = %d", pokemonJogador.getVida());
            System.out.printf("\nVida Pokemon inimigo = %d\n\n", pokemonNPC.getVida());

            if (turnoJogador) {
                System.out.println("###= Escolha um golpe para atacar =###");
                int danoCalculado = jogador.escolherGolpe(pokemonJogador, pokemonNPC);
                int taxaAcerto = new Random().nextInt(100);
                //System.out.printf(" Dano calculado: %d",danoCalculado);
                System.out.print(" Taxa de acerto: "+taxaAcerto+"%");

                double taxaAcertoPercente = taxaAcerto/100D;
                int danoFinal = (int) (danoCalculado * taxaAcerto/100D);
                pokemonNPC.setVida(pokemonNPC.getVida() - danoFinal);
                System.out.printf(" Dano final: %d\n",danoFinal);
            } else {
                System.out.println("\n=== Inimigo ataca ===");
                int danoCalculado = npc.escolherGolpe(pokemonNPC, pokemonJogador);
                int taxaAcerto = 30 + new Random().nextInt(70);
                //System.out.printf(" Dano calculado: %d",danoCalculado);
                System.out.print(" Taxa de acerto: "+taxaAcerto+"%");

                double taxaAcertoPercente = taxaAcerto/100D;
                int danoFinal = (int) (danoCalculado * taxaAcerto/100D);

                pokemonJogador.setVida(pokemonJogador.getVida() - danoFinal);
                System.out.printf(" Dano final: %d\n",danoFinal);

            }

            if (pokemonJogador.getVida() <= 0) {
                pokemonJogador.setVida(0);
                System.out.println("Seu pokemon morreu, escolha outro pokemon");
                pokemonJogador = jogador.escolherPokemon();
            }

            if (pokemonNPC.getVida() <= 0) {
                pokemonNPC.setVida(0);
                System.out.println("Vc matou o pokemon inimigo");
                pokemonNPC = npc.escolherPokemon();
            }

            turnoJogador = !turnoJogador;
            jogar--;
        }

        ////


    }

}