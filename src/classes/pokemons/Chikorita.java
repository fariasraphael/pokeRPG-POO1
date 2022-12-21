package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Chikorita extends Pokemon {

    public Chikorita(String nome) {
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
    public Bayleef evolui() {
        Bayleef bayleef = new Bayleef(this.getNome());
        bayleef.setGolpes(this.getGolpes());
        bayleef.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        bayleef.setVidaMaxima(bayleef.getVida());
        bayleef.setReviveu(false);

        return bayleef;
    }
}

