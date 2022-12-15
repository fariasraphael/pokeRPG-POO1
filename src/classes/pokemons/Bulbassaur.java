package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;
import classes.sistema.StaticsGolpe;

import java.util.Random;

public class Bulbassaur extends Pokemon {

    public Bulbassaur(String nome) {
        super(nome, Statics.getELEMENTO("grama"), new Random().nextInt(100)+800);

        Golpe[] golpes = {
                StaticsGolpe.getGOLPE("razorLeaf"),
                StaticsGolpe.getGOLPE("vineWhip"),
                StaticsGolpe.getGOLPE("bulletSeed"),
                StaticsGolpe.getGOLPE("leafBlade"),
        };
        super.setGolpes(golpes);
    }



    @Override
    public Ivysaur evolui() {
        Ivysaur ivysaur = new Ivysaur(this.getNome());
        ivysaur.setGolpes(this.getGolpes());
        ivysaur.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        ivysaur.setVidaMaxima(ivysaur.getVida());
        ivysaur.setReviveu(false);

        return ivysaur;
    }

}