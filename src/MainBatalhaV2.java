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

        boolean turnoJogador = true;
        if(turnoJogador){
            int dano = jogador.escolherGolpe(pokemonJogador,pokemonNPC);
            System.out.println(dano);

        }







    }

}