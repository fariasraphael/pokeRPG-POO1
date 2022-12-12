package classes.sistema;

import java.util.Random;

public class Golpes {

    public void inicializaGolpes(){
        //golpes pokemon do tipo Fogo
        Golpe growl = new Golpe();
        Golpe fireFang = new Golpe();
        Golpe ember = new Golpe();
        Golpe flameThrower = new Golpe();

        growl.setNome("growl");
        growl.setDano(50 + new Random().nextInt(50));
        growl.setTipo(Statics.getELEMENTO("fogo"));
        growl.setUsos(0);
        growl.setMaxUsos(3);

        fireFang.setNome("fireFang");
        fireFang.setDano(50 + new Random().nextInt(100));
        fireFang.setTipo(Statics.getELEMENTO("fogo"));
        fireFang.setUsos(0);
        fireFang.setMaxUsos(3);

        ember.setNome("ember");
        ember.setDano(100 + new Random().nextInt(100));
        ember.setTipo(Statics.getELEMENTO("fogo"));
        ember.setUsos(0);
        ember.setMaxUsos(3);

        flameThrower.setNome("flameThrower");
        flameThrower.setDano(150 + new Random().nextInt(150));
        flameThrower.setTipo(Statics.getELEMENTO("fogo"));
        flameThrower.setUsos(0);
        flameThrower.setMaxUsos(3);



        StaticsGolpe.setGOLPE("growl", growl);
        StaticsGolpe.setGOLPE("fireFang", fireFang);
        StaticsGolpe.setGOLPE("ember", ember);
        StaticsGolpe.setGOLPE("flameThrower", flameThrower);

    }
}
