package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Charmander extends Pokemon {

    public Charmander(String nome) {
        super(nome, Statics.getELEMENTO("fogo"), (700 + (new Random().nextInt(300))));
        Golpe[] golpes = {
          Statics.getGOLPE("growl"),
          Statics.getGOLPE("fireFang"),
          Statics.getGOLPE("ember"),
          Statics.getGOLPE("flameThrower"),
        };
        super.setGolpes(golpes);
//        System.out.printf("Criando um novo %s\n", this);
    }


    @Override
    public Charmeleon evolui() {
        Charmeleon charmeleon = new Charmeleon(this.getNome());
        charmeleon.setGolpes(this.getGolpes());
        charmeleon.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        charmeleon.setVidaMaxima(charmeleon.getVida());
        charmeleon.setReviveu(false);

        return charmeleon;
    }

}
