package classes.sistema;

import java.util.Random;

public class Golpes {

    public static void inicializaGolpes(){
        //golpes pokemon do tipo Fogo
        Golpe growl = new Golpe();
        Golpe fireFang = new Golpe();
        Golpe ember = new Golpe();
        Golpe flameThrower = new Golpe();

        growl.setNome("growl");
        growl.setDano(50 + new Random().nextInt(50));
        growl.setTipo(Statics.getELEMENTO("fogo"));
        growl.setUsos(5);
        growl.setMaxUsos(5);

        fireFang.setNome("fireFang");
        fireFang.setDano(50 + new Random().nextInt(100));
        fireFang.setTipo(Statics.getELEMENTO("fogo"));
        fireFang.setUsos(4);
        fireFang.setMaxUsos(4);

        ember.setNome("ember");
        ember.setDano(100 + new Random().nextInt(100));
        ember.setTipo(Statics.getELEMENTO("fogo"));
        ember.setUsos(3);
        ember.setMaxUsos(3);

        flameThrower.setNome("flameThrower");
        flameThrower.setDano(150 + new Random().nextInt(150));
        flameThrower.setTipo(Statics.getELEMENTO("fogo"));
        flameThrower.setUsos(2);
        flameThrower.setMaxUsos(2);



        StaticsGolpe.setGOLPE("growl", growl);
        StaticsGolpe.setGOLPE("fireFang", fireFang);
        StaticsGolpe.setGOLPE("ember", ember);
        StaticsGolpe.setGOLPE("flameThrower", flameThrower);


        //golpes pokemon do tipo Grama

        Golpe razorLeaf = new Golpe();
        Golpe vineWhip = new Golpe();
        Golpe bulletSeed = new Golpe();
        Golpe leafBlade = new Golpe();

        razorLeaf.setNome("razorLeaf");
        razorLeaf.setDano(50 + new Random().nextInt(50));
        razorLeaf.setTipo(Statics.getELEMENTO("grama"));
        razorLeaf.setUsos(5);
        razorLeaf.setMaxUsos(5);

        vineWhip.setNome("vineWhip");
        vineWhip.setDano(50 + new Random().nextInt(50));
        vineWhip.setTipo(Statics.getELEMENTO("grama"));
        vineWhip.setUsos(5);
        vineWhip.setMaxUsos(5);

        bulletSeed.setNome("bulletSeed");
        bulletSeed.setDano(50 + new Random().nextInt(50));
        bulletSeed.setTipo(Statics.getELEMENTO("grama"));
        bulletSeed.setUsos(5);
        bulletSeed.setMaxUsos(5);

        leafBlade.setNome("leafBlade");
        leafBlade.setDano(50 + new Random().nextInt(50));
        leafBlade.setTipo(Statics.getELEMENTO("grama"));
        leafBlade.setUsos(5);
        leafBlade.setMaxUsos(5);

        StaticsGolpe.setGOLPE("razorLeaf", razorLeaf);
        StaticsGolpe.setGOLPE("vineWhip", vineWhip);
        StaticsGolpe.setGOLPE("bulletSeed", bulletSeed);
        StaticsGolpe.setGOLPE("leafBlade", leafBlade);
    }
}