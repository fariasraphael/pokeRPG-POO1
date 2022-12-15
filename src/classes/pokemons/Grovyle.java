package classes.pokemons;

import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Grovyle extends Treecko {

    public Grovyle(String nome) {
        super(nome);
        this.setLevel(2);

    }

    private Golpe[] upgradeGolpes(){
        Golpe[] golpes = {
                Statics.getGOLPE("clamp"),
                Statics.getGOLPE("crabhammer"),
                Statics.getGOLPE("waterfall"),
                Statics.getGOLPE("dive"),
        };

        golpes[0].setDano(100 + new Random().nextInt(70));
        golpes[1].setDano(150 + new Random().nextInt(70));
        golpes[2].setDano(200 + new Random().nextInt(70));
        golpes[3].setDano(300 + new Random().nextInt(70));

        return golpes;
    }

    @Override
    public Sceptile evolui() {
        Sceptile sceptile = new Sceptile(this.getNome());
        sceptile.setGolpes(this.getGolpes());
        sceptile.setVida(super.getVidaMaxima() + (new Random().nextInt(400) + 200));
        sceptile.setVidaMaxima(sceptile.getVida());
        sceptile.setReviveu(false);

        return sceptile;
    }
}
