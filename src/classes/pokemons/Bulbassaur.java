package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;
import classes.sistema.StaticsGolpe;

import java.util.Random;

public class Bulbassaur extends Pokemon {

    public Bulbassaur(String nome) {
        super(nome, Statics.getELEMENTO("grama"), new Random().nextInt(100)+800);

        Golpe[] golpes = {
                StaticsGolpe.getGOLPE("razorLeaf"),
                StaticsGolpe.getGOLPE("vineWhip"),
                StaticsGolpe.getGOLPE("bulletSeed"),
                StaticsGolpe.getGOLPE("leafBlade"),
        };
        super.setGolpes(golpes);
    }

    @Override
    public int ataca(Golpe golpe, Pokemon pokemonInimigo) {
        if (golpe.getTipo().getVantagem() == pokemonInimigo.getElemento()) {
            return (int) (golpe.getDano() * 1.2 * (this.getLevel()/10 + 1 ));
        } else if (golpe.getTipo().getFraqueza() == pokemonInimigo.getElemento()) {
            return (int) (golpe.getDano() * 0.7 * (this.getLevel()/10 + 1 ));
        }

        return ((int) golpe.getDano() * (this.getLevel()/10 + 1 ));
    }


    @Override
    public Ivysaur evolui() {
        Ivysaur ivysaur = new Ivysaur(this.getNome());
        ivysaur.setGolpes(this.getGolpes());
        ivysaur.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        ivysaur.setVidaMaxima(ivysaur.getVida());
        ivysaur.setReviveu(false);

        return ivysaur;
    }

}