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
        growl.setMaxUsos(2 + new Random().nextInt(4));
        growl.setUsos(growl.getMaxUsos());

        fireFang.setNome("fireFang");
        fireFang.setDano(50 + new Random().nextInt(100));
        fireFang.setTipo(Statics.getELEMENTO("fogo"));
        fireFang.setMaxUsos(2 + new Random().nextInt(3));
        fireFang.setUsos(fireFang.getMaxUsos());

        ember.setNome("ember");
        ember.setDano(100 + new Random().nextInt(100));
        ember.setTipo(Statics.getELEMENTO("fogo"));
        ember.setMaxUsos(1 + new Random().nextInt(4));
        ember.setUsos(ember.getMaxUsos());

        flameThrower.setNome("flameThrower");
        flameThrower.setDano(150 + new Random().nextInt(150));
        flameThrower.setTipo(Statics.getELEMENTO("fogo"));
        flameThrower.setMaxUsos(1 + new Random().nextInt(2));
        flameThrower.setUsos(flameThrower.getMaxUsos());

        StaticsGolpe.setGOLPE("growl", growl);
        StaticsGolpe.setGOLPE("fireFang", fireFang);
        StaticsGolpe.setGOLPE("ember", ember);
        StaticsGolpe.setGOLPE("flameThrower", flameThrower);

        //golpes pokemon do tipo Grama
        Golpe razorLeaf = new Golpe();
        Golpe vineWhip = new Golpe();
        Golpe whirlwind = new Golpe();
        Golpe petalDance = new Golpe();

        razorLeaf.setNome("razorLeaf");
        razorLeaf.setDano(50 + new Random().nextInt(50));
        razorLeaf.setTipo(Statics.getELEMENTO("grama"));
        razorLeaf.setMaxUsos(2 + new Random().nextInt(4));
        razorLeaf.setUsos(razorLeaf.getMaxUsos());

        vineWhip.setNome("vineWhip");
        vineWhip.setDano(50 + new Random().nextInt(100));
        vineWhip.setTipo(Statics.getELEMENTO("grama"));
        vineWhip.setMaxUsos(2 + new Random().nextInt(3));
        vineWhip.setUsos(vineWhip.getMaxUsos());

        whirlwind.setNome("whirlwind");
        whirlwind.setDano(100 + new Random().nextInt(100));
        whirlwind.setTipo(Statics.getELEMENTO("grama"));
        whirlwind.setMaxUsos(1 + new Random().nextInt(4));
        whirlwind.setUsos(whirlwind.getMaxUsos());

        petalDance.setNome("petalDance");
        petalDance.setDano(150 + new Random().nextInt(150));
        petalDance.setTipo(Statics.getELEMENTO("grama"));
        petalDance.setMaxUsos(1 + new Random().nextInt(2));
        petalDance.setUsos(petalDance.getMaxUsos());

        StaticsGolpe.setGOLPE("razorLeaf", razorLeaf);
        StaticsGolpe.setGOLPE("vineWhip", vineWhip);
        StaticsGolpe.setGOLPE("whirlwind", whirlwind);
        StaticsGolpe.setGOLPE("petalDance", petalDance);

        //golpes pokemon do tipo Agua
        Golpe bubble = new Golpe();
        Golpe bubbleBeam = new Golpe();
        Golpe waterGun = new Golpe();
        Golpe iceBeam = new Golpe();

        bubble.setNome("bubble");
        bubble.setDano(50 + new Random().nextInt(50));
        bubble.setTipo(Statics.getELEMENTO("agua"));
        bubble.setMaxUsos(2 + new Random().nextInt(4));
        bubble.setUsos(bubble.getMaxUsos());

        bubbleBeam.setNome("bubbleBeam");
        bubbleBeam.setDano(50 + new Random().nextInt(100));
        bubbleBeam.setTipo(Statics.getELEMENTO("agua"));
        bubbleBeam.setMaxUsos(2 + new Random().nextInt(3));
        bubbleBeam.setUsos(bubbleBeam.getMaxUsos());

        waterGun.setNome("waterGun");
        waterGun.setDano(100 + new Random().nextInt(100));
        waterGun.setTipo(Statics.getELEMENTO("agua"));
        waterGun.setMaxUsos(1 + new Random().nextInt(4));
        waterGun.setUsos(waterGun.getMaxUsos());

        iceBeam.setNome("iceBeam");
        iceBeam.setDano(150 + new Random().nextInt(150));
        iceBeam.setTipo(Statics.getELEMENTO("agua"));
        iceBeam.setMaxUsos(1 + new Random().nextInt(2));
        iceBeam.setUsos(iceBeam.getMaxUsos());

        StaticsGolpe.setGOLPE("bubble", bubble);
        StaticsGolpe.setGOLPE("bubbleBeam", bubbleBeam);
        StaticsGolpe.setGOLPE("waterGun", waterGun);
        StaticsGolpe.setGOLPE("iceBeam", iceBeam);

        //golpes pokemon do tipo Normal
        Golpe hyperFang = new Golpe();
        Golpe tackle = new Golpe();
        Golpe bite = new Golpe();
        Golpe thunderbolt = new Golpe();

        hyperFang.setNome("hyperFang");
        hyperFang.setDano(50 + new Random().nextInt(50));
        hyperFang.setTipo(Statics.getELEMENTO("normal"));
        hyperFang.setMaxUsos(2 + new Random().nextInt(4));
        hyperFang.setUsos(hyperFang.getMaxUsos());

        tackle.setNome("tackle");
        tackle.setDano(50 + new Random().nextInt(100));
        tackle.setTipo(Statics.getELEMENTO("normal"));
        tackle.setMaxUsos(2 + new Random().nextInt(3));
        tackle.setUsos(tackle.getMaxUsos());

        bite.setNome("bite");
        bite.setDano(100 + new Random().nextInt(100));
        bite.setTipo(Statics.getELEMENTO("normal"));
        bite.setMaxUsos(1 + new Random().nextInt(4));
        bite.setUsos(bite.getMaxUsos());

        thunderbolt.setNome("thunderbolt");
        thunderbolt.setDano(150 + new Random().nextInt(150));
        thunderbolt.setTipo(Statics.getELEMENTO("normal"));
        thunderbolt.setMaxUsos(1 + new Random().nextInt(2));
        thunderbolt.setUsos(thunderbolt.getMaxUsos());

        StaticsGolpe.setGOLPE("hyperFang", hyperFang);
        StaticsGolpe.setGOLPE("tackle", tackle);
        StaticsGolpe.setGOLPE("bite", bite);
        StaticsGolpe.setGOLPE("thunderbolt", thunderbolt);

    }
}
