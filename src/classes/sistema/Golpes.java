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
        Golpe tackle = new Golpe();
        Golpe solarBeam = new Golpe();

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

        tackle.setNome("tackle");
        tackle.setDano(50 + new Random().nextInt(50));
        tackle.setTipo(Statics.getELEMENTO("grama"));
        tackle.setUsos(5);
        tackle.setMaxUsos(5);

        solarBeam.setNome("solarBeam");
        solarBeam.setDano(50 + new Random().nextInt(50));
        solarBeam.setTipo(Statics.getELEMENTO("grama"));
        solarBeam.setUsos(5);
        solarBeam.setMaxUsos(5);

        StaticsGolpe.setGOLPE("razorLeaf", razorLeaf);
        StaticsGolpe.setGOLPE("vineWhip", vineWhip);
        StaticsGolpe.setGOLPE("bulletSeed", bulletSeed);
        StaticsGolpe.setGOLPE("leafBlade", leafBlade);
        StaticsGolpe.setGOLPE("tackle", tackle);
        StaticsGolpe.setGOLPE("solarBeam", solarBeam);


        //golpes pokemon do tipo Água

        Golpe clamp = new Golpe();
        Golpe crabhammer = new Golpe();
        Golpe waterfall = new Golpe();
        Golpe dive = new Golpe();
        Golpe FishiousRend = new Golpe();
        Golpe FlipTurn = new Golpe();
        Golpe MaxGeyser = new Golpe();


        clamp.setNome("clamp");
        clamp.setDano(50 + new Random().nextInt(50));
        clamp.setTipo(Statics.getELEMENTO("agua"));
        clamp.setUsos(5);
        clamp.setMaxUsos(5);

        crabhammer.setNome("crabhammer");
        crabhammer.setDano(50 + new Random().nextInt(50));
        crabhammer.setTipo(Statics.getELEMENTO("agua"));
        crabhammer.setUsos(5);
        crabhammer.setMaxUsos(5);

        waterfall.setNome("waterfall");
        waterfall.setDano(50 + new Random().nextInt(50));
        waterfall.setTipo(Statics.getELEMENTO("agua"));
        waterfall.setUsos(5);
        waterfall.setMaxUsos(5);

        dive.setNome("dive");
        dive.setDano(50 + new Random().nextInt(50));
        dive.setTipo(Statics.getELEMENTO("agua"));
        dive.setUsos(5);
        dive.setMaxUsos(5);

        FishiousRend.setNome("FishiousRend");
        FishiousRend.setDano(50 + new Random().nextInt(50));
        FishiousRend.setTipo(Statics.getELEMENTO("agua"));
        FishiousRend.setUsos(5);
        FishiousRend.setMaxUsos(5);

        FlipTurn.setNome("FlipTurn");
        FlipTurn.setDano(50 + new Random().nextInt(50));
        FlipTurn.setTipo(Statics.getELEMENTO("agua"));
        FlipTurn.setUsos(5);
        FlipTurn.setMaxUsos(5);

        MaxGeyser.setNome("MaxGeyser");
        MaxGeyser.setDano(50 + new Random().nextInt(50));
        MaxGeyser.setTipo(Statics.getELEMENTO("agua"));
        MaxGeyser.setUsos(5);
        MaxGeyser.setMaxUsos(5);

        StaticsGolpe.setGOLPE("clamp", clamp);
        StaticsGolpe.setGOLPE("crabhammer", crabhammer);
        StaticsGolpe.setGOLPE("waterfall", waterfall);
        StaticsGolpe.setGOLPE("dive", dive);
        StaticsGolpe.setGOLPE("FishiousRend", FishiousRend);
        StaticsGolpe.setGOLPE("FlipTurn", FlipTurn);
        StaticsGolpe.setGOLPE("MaxGeyser", MaxGeyser);

    }
}