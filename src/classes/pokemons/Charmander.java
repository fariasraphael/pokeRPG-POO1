package classes.pokemons;

import classes.abstracts.Pokemon;
import classes.sistema.Golpe;
import classes.sistema.Statics;
import classes.sistema.StaticsGolpe;

import java.util.Random;

public class Charmander extends Pokemon {

    public Charmander(String nome) {
        super(nome, Statics.getELEMENTO("fogo"), (700 + (new Random().nextInt(300))));
        Golpe[] golpes = {
          StaticsGolpe.getGOLPE("growl"),
          StaticsGolpe.getGOLPE("fireFang"),
          StaticsGolpe.getGOLPE("ember"),
          StaticsGolpe.getGOLPE("flameThrower"),
        };
        super.setGolpes(golpes);
//        System.out.printf("Criando um novo %s\n", this);
    }

    @Override
    public int ataca(Golpe golpe, Pokemon pokemonInimigo) {
        if (golpe.getTipo().getVantagem() == pokemonInimigo.getElemento()) {
            return (int) (golpe.getDano() * 1.2 * (this.getLevel()/10 + 1 ));
        } else if (golpe.getTipo().getFraqueza() == pokemonInimigo.getElemento()) {
            return (int) (golpe.getDano() * 0.7 * (this.getLevel()/10 + 1 ));
        }

        return ((int) golpe.getDano() * (this.getLevel()/10 + 1 ));
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
