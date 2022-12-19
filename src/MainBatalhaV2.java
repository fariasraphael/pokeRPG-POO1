import classes.abstracts.Pokemon;
import classes.abstracts.Treinador;
import classes.sistema.Batalha;
import classes.sistema.Jogador;
import classes.sistema.NPC;
import classes.sistema.Statics;

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

        while (jogar < 2) {
            System.out.printf("\nVida do seu Pokemon = %d", pokemonJogador.getVida());
            System.out.printf("\nVida Pokemon inimigo = %d\n", pokemonNPC.getVida());

            if (turnoJogador) {
                int dano = jogador.escolherGolpe(pokemonJogador, pokemonNPC);
                pokemonNPC.setVida(pokemonNPC.getVida() - dano);
            } else {
                System.out.println("\nInimigo ataca:");
                int dano = npc.escolherGolpe(pokemonNPC, pokemonJogador);
                System.out.println(dano);
                pokemonJogador.setVida(pokemonJogador.getVida() - dano);
            }

            if (pokemonJogador.getVida() < 0) {
                pokemonJogador.setVida(0);
                System.out.println("Seu pokemon morreu, escolha outro pokemon");
                pokemonJogador = jogador.escolherPokemon();
            }

            if (pokemonNPC.getVida() < 0) {
                pokemonNPC.setVida(0);
                System.out.println("Vc matou o pokemon inimigo");
                pokemonNPC = npc.escolherPokemon();
            }

            turnoJogador = !turnoJogador;
            jogar++;
        }

        ////


    }

}