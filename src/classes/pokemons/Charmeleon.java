package classes.pokemons;

import classes.sistema.Golpe;
import classes.sistema.StaticsGolpe;

import java.util.Random;

public class Charmeleon extends Charmander {

    public Charmeleon(String nome) {
        super(nome);
        //super.setVida(super.getVidaMaxima() + 100);//(new Random().nextInt(200) + 100));
        //super.setGolpes(upgradeGolpes());
        this.setLevel(2);
//        System.out.printf("Criando um novo %s\n", this);
    }

    private Golpe[] upgradeGolpes(){
        Golpe[] golpes = {
                StaticsGolpe.getGOLPE("growl"),
                StaticsGolpe.getGOLPE("fireFang"),
                StaticsGolpe.getGOLPE("ember"),
                StaticsGolpe.getGOLPE("flameThrower"),
        };

        golpes[0].setDano(100 + new Random().nextInt(70));
        golpes[1].setDano(150 + new Random().nextInt(70));
        golpes[2].setDano(200 + new Random().nextInt(70));
        golpes[3].setDano(300 + new Random().nextInt(70));

        return golpes;
    }

    @Override
    public Charizard evolui() {
        Charizard charizard = new Charizard(this.getNome());
        charizard.setGolpes(this.getGolpes());
        charizard.setVida(super.getVidaMaxima() + (new Random().nextInt(400) + 200));
        charizard.setVidaMaxima(charizard.getVida());
        charizard.setReviveu(false);

        return charizard;
    }
}
