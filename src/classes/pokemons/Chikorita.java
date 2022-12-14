package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;
import classes.sistema.StaticsGolpe;

import java.util.Random;

public class Chikorita extends Pokemon {

    public Chikorita(String nome) {
        super(nome, Statics.getELEMENTO("grama"), (700 + (new Random().nextInt(300))));
        Golpe[] golpes = {
                StaticsGolpe.getGOLPE("tackle"),
                StaticsGolpe.getGOLPE("solarBeam"),
                StaticsGolpe.getGOLPE("vineWhip"),
                StaticsGolpe.getGOLPE("leafBlade"),
        };
        super.setGolpes(golpes);
//
    }

    @Override
    public int ataca(Golpe golpe, Pokemon pokemonInimigo) {
        if (golpe.getTipo().getVantagem() == pokemonInimigo.getElemento()) {
            return (int) (golpe.getDano() * 1.2 * (this.getLevel() / 10 + 1));
        } else if (golpe.getTipo().getFraqueza() == pokemonInimigo.getElemento()) {
            return (int) (golpe.getDano() * 0.7 * (this.getLevel() / 10 + 1));
        }

        return ((int) golpe.getDano() * (this.getLevel() / 10 + 1));
    }

    @Override
    public Bayleef evolui() {
        Bayleef bayleef = new Bayleef(this.getNome());
        bayleef.setGolpes(this.getGolpes());
        bayleef.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        bayleef.setVidaMaxima(bayleef.getVida());
        bayleef.setReviveu(false);

        return bayleef;
    }
}

