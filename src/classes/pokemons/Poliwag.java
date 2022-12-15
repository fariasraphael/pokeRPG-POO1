package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Poliwag extends Pokemon {

    public Poliwag(String nome) {
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
    public Poliwhirl evolui() {
        Poliwhirl poliwhirl = new Poliwhirl(this.getNome());
        poliwhirl.setGolpes(this.getGolpes());
        poliwhirl.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        poliwhirl.setVidaMaxima(poliwhirl.getVida());
        poliwhirl.setReviveu(false);

        return poliwhirl;
    }
}