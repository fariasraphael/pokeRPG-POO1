package classes.pokemons;

import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Bayleef extends Chikorita {

    public Bayleef(String nome) {
        super(nome);
        this.setLevel(2);

    }

    private Golpe[] upgradeGolpes(){
        Golpe[] golpes = {
                Statics.getGOLPE("razorLeaf"),
                Statics.getGOLPE("vineWhip"),
                Statics.getGOLPE("bulletSeed"),
                Statics.getGOLPE("leafBlade"),
        };

        golpes[0].setDano(100 + new Random().nextInt(70));
        golpes[1].setDano(150 + new Random().nextInt(70));
        golpes[2].setDano(200 + new Random().nextInt(70));
        golpes[3].setDano(300 + new Random().nextInt(70));

        return golpes;
    }

    @Override
    public Meganium evolui() {
        Meganium meganium = new Meganium(this.getNome());
        meganium.setGolpes(this.getGolpes());
        meganium.setVida(super.getVidaMaxima() + (new Random().nextInt(400) + 200));
        meganium.setVidaMaxima(meganium.getVida());
        meganium.setReviveu(false);

        return meganium;
    }
}
