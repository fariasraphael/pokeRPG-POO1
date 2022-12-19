package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Krabby extends Pokemon {

    public Krabby(String nome) {
        super(nome, Statics.getELEMENTO("agua"), (700 + (new Random().nextInt(300))));
        Golpe[] golpes = {
                Statics.getGOLPE("bubble"),
                Statics.getGOLPE("bubbleBeam"),
                Statics.getGOLPE("waterGun"),
                Statics.getGOLPE("iceBeam"),
        };
        super.setGolpes(golpes);
//
    }

    @Override
    public Kingler evolui() {
        Kingler kingler = new Kingler(this.getNome());
        kingler.setGolpes(this.getGolpes());
        kingler.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        kingler.setVidaMaxima(kingler.getVida());
        kingler.setReviveu(false);

        return kingler;
    }
}