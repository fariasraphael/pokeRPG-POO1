package classes.pokemons;

import classes.sistema.Golpe;
import classes.sistema.StaticsGolpe;

import java.util.Random;

public class Wartortle extends Squirtle {

    public Wartortle(String nome) {
        super(nome);
        this.setLevel(2);

    }

    private Golpe[] upgradeGolpes(){
        Golpe[] golpes = {
                StaticsGolpe.getGOLPE("clamp"),
                StaticsGolpe.getGOLPE("crabhammer"),
                StaticsGolpe.getGOLPE("waterfall"),
                StaticsGolpe.getGOLPE("dive"),
        };

        golpes[0].setDano(100 + new Random().nextInt(70));
        golpes[1].setDano(150 + new Random().nextInt(70));
        golpes[2].setDano(200 + new Random().nextInt(70));
        golpes[3].setDano(300 + new Random().nextInt(70));

        return golpes;
    }

    @Override
    public Blastoise evolui() {
        Blastoise blastoise = new Blastoise(this.getNome());
        blastoise.setGolpes(this.getGolpes());
        blastoise.setVida(super.getVidaMaxima() + (new Random().nextInt(400) + 200));
        blastoise.setVidaMaxima(blastoise.getVida());
        blastoise.setReviveu(false);

        return blastoise;
    }
}
