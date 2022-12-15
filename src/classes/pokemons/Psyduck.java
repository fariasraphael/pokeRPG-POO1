package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Psyduck extends Pokemon {

    public Psyduck(String nome) {
        super(nome, Statics.getELEMENTO("agua"), (700 + (new Random().nextInt(300))));
        Golpe[] golpes = {
                Statics.getGOLPE("bubble"),
                Statics.getGOLPE("bubbleBeam"),
                Statics.getGOLPE("waterGun"),
                Statics.getGOLPE("iceBeam"),
        };
        super.setGolpes(golpes);
//        System.out.printf("Criando um novo %s\n", this);
    }


    @Override
    public Golduck evolui() {
        Golduck golduck = new Golduck(this.getNome());
        golduck.setGolpes(this.getGolpes());
        golduck.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        golduck.setVidaMaxima(golduck.getVida());
        golduck.setReviveu(false);

        return golduck;
    }

}
