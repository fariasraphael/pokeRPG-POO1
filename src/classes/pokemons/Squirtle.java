package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Squirtle extends Pokemon {

    public Squirtle(String nome) {
        super(nome, Statics.getELEMENTO("agua"), (700 + (new Random().nextInt(300))));
        Golpe[] golpes = {
                Statics.getGOLPE("clamp"),
                Statics.getGOLPE("crabhammer"),
                Statics.getGOLPE("waterfall"),
                Statics.getGOLPE("dive"),
        };
        super.setGolpes(golpes);
//
    }

    @Override
    public Wartortle evolui() {
        Wartortle wartortle = new Wartortle(this.getNome());
        wartortle.setGolpes(this.getGolpes());
        wartortle.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        wartortle.setVidaMaxima(wartortle.getVida());
        wartortle.setReviveu(false);

        return wartortle;
    }
}