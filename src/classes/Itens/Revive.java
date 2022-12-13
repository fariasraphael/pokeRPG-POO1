package classes.Itens;

import classes.abstracts.Item;
import classes.abstracts.Pokemon;

public class Revive extends Item {

    @Override
    public Boolean usarItem (Pokemon pokemon){
        if(!pokemon.isReviveu()){
            //pokemon.setVida(pokemon.getVidaInicial() * 0.75); // se considerar que a vida de cada pokemon pode variar para aumentar a dificuldade da batalha
            pokemon.setVida((int) (0.75 * pokemon.getVidaMaxima())); //Se considerarmos que na criacao todos pokemons tem vida igual a 1000
            pokemon.setReviveu(true);

            return true;
        }
        return false;
    }

}
