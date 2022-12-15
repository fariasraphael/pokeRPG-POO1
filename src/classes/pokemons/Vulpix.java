package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;

import java.util.Random;

public class Vulpix extends Pokemon {

    public Vulpix(String nome) {
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
    public Ninetales evolui() {
        Ninetales ninetales = new Ninetales(this.getNome());
        ninetales.setGolpes(this.getGolpes());
        ninetales.setVida(super.getVidaMaxima() + (new Random().nextInt(200) + 300));
        ninetales.setVidaMaxima(ninetales.getVida());
        ninetales.setReviveu(false);

        return ninetales;
    }

}
