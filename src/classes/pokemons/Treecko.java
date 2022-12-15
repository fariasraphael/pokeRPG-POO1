package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Treecko extends Pokemon {

    public Treecko(String nome) {
        super(nome, Statics.getELEMENTO("grama"), (700 + (new Random().nextInt(300))));
        Golpe[] golpes = {
                Statics.getGOLPE("razorLeaf"),
                Statics.getGOLPE("vineWhip"),
                Statics.getGOLPE("bulletSeed"),
                Statics.getGOLPE("leafBlade"),
        };
        super.setGolpes(golpes);
//
    }

    @Override
    public Grovyle evolui() {
        Grovyle grovyle = new Grovyle(this.getNome());
        grovyle.setGolpes(this.getGolpes());
        grovyle.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        grovyle.setVidaMaxima(grovyle.getVida());
        grovyle.setReviveu(false);

        return grovyle;
    }
}