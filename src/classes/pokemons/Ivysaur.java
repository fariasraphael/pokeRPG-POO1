package classes.pokemons;

import classes.sistema.Golpe;
import classes.sistema.StaticsGolpe;

import java.util.Random;

public class Ivysaur extends Bulbassaur{
    public Ivysaur (String nome) {
        super(nome);
        this.setLevel(2);

    }

    private Golpe[] upgradeGolpes(){
        Golpe[] golpes = {
                StaticsGolpe.getGOLPE("razorLeaf"),
                StaticsGolpe.getGOLPE("vineWhip"),
                StaticsGolpe.getGOLPE("bulletSeed"),
                StaticsGolpe.getGOLPE("leafBlade"),
        };

        golpes[0].setDano(100 + new Random().nextInt(70));
        golpes[1].setDano(150 + new Random().nextInt(70));
        golpes[2].setDano(200 + new Random().nextInt(70));
        golpes[3].setDano(300 + new Random().nextInt(70));

        return golpes;
    }

    @Override
    public Venusaur evolui() {
        Venusaur venusaur = new Venusaur(this.getNome());
        venusaur.setGolpes(this.getGolpes());
        venusaur.setVida(super.getVidaMaxima() + (new Random().nextInt(400) + 200));
        venusaur.setVidaMaxima(venusaur.getVida());
        venusaur.setReviveu(false);

        return venusaur;
    }
}
