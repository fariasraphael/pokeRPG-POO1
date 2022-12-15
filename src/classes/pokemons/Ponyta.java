package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Ponyta extends Pokemon {

    public Ponyta(String nome) {
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
    public Rapidash evolui() {
        Rapidash rapidash = new Rapidash(this.getNome());
        rapidash.setGolpes(this.getGolpes());
        rapidash.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        rapidash.setVidaMaxima(rapidash.getVida());
        rapidash.setReviveu(false);

        return rapidash;
    }

}
