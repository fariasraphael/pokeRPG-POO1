package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Turtwig extends Pokemon {

    public Turtwig(String nome) {
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
    public Grotle evolui() {
        Grotle grotle = new Grotle(this.getNome());
        grotle.setGolpes(this.getGolpes());
        grotle.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        grotle.setVidaMaxima(grotle.getVida());
        grotle.setReviveu(false);

        return grotle;
    }
}