package classes.sistema;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statics {
    // Configuracao estatica dos elementos
    private static Map<String, Elemento> ELEMENTOS = new HashMap<>();
    public static Elemento getELEMENTO(String key) {
        return ELEMENTOS.get(key);
    }
    public static void setELEMENTO(String key, Elemento elemento) {
        ELEMENTOS.put(key, elemento);
    }

    private static void inicializaElementos() {
        // inicializando os 4 elementos basicos FOGO, AGUA, GRAMA e NORMAL
        Elemento fogo = new Elemento("fogo");
        Elemento agua = new Elemento("agua");
        Elemento grama = new Elemento("grama");
        Elemento normal = new Elemento("normal");

        // configurando vantagens e fraquezas
        fogo.setFraqueza(agua);
        fogo.setVantagem(grama);

        agua.setFraqueza(grama);
        agua.setVantagem(fogo);

        grama.setFraqueza(fogo);
        grama.setVantagem(agua);

        normal.setFraqueza(null);
        normal.setVantagem(null);

        // salvando elementos no statics
        Statics.setELEMENTO("fogo", fogo);
        Statics.setELEMENTO("agua", agua);
        Statics.setELEMENTO("grama", grama);
        Statics.setELEMENTO("normal", normal);
    }

    // Configuracao estatica dos golpes
    private static Map<String, Golpe> GOLPES = new HashMap<>();
    public static Golpe getGOLPE(String key) {
        return GOLPES.get(key);
    }
    public static void setGOLPE(String key, Golpe golpe) {
        GOLPES.put(key, golpe);
    }

    private static void inicializaGolpes(){
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

        Statics.setGOLPE("growl", growl);
        Statics.setGOLPE("fireFang", fireFang);
        Statics.setGOLPE("ember", ember);
        Statics.setGOLPE("flameThrower", flameThrower);


        //golpes pokemon do tipo Grama

        Golpe razorLeaf = new Golpe();
        Golpe vineWhip = new Golpe();
        Golpe bulletSeed = new Golpe();
        Golpe leafBlade = new Golpe();

        razorLeaf.setNome("razorLeaf");
        razorLeaf.setDano(50 + new Random().nextInt(50));
        razorLeaf.setTipo(Statics.getELEMENTO("grama"));
        razorLeaf.setMaxUsos(2 + new Random().nextInt(4));
        razorLeaf.setUsos(razorLeaf.getMaxUsos());

        vineWhip.setNome("vineWhip");
        vineWhip.setDano(50 + new Random().nextInt(50));
        vineWhip.setTipo(Statics.getELEMENTO("grama"));
        vineWhip.setMaxUsos(2 + new Random().nextInt(3));
        vineWhip.setUsos(vineWhip.getMaxUsos());

        bulletSeed.setNome("bulletSeed");
        bulletSeed.setDano(50 + new Random().nextInt(50));
        bulletSeed.setTipo(Statics.getELEMENTO("grama"));
        bulletSeed.setMaxUsos(1 + new Random().nextInt(4));
        bulletSeed.setUsos(bulletSeed.getMaxUsos());

        leafBlade.setNome("leafBlade");
        leafBlade.setDano(50 + new Random().nextInt(50));
        leafBlade.setTipo(Statics.getELEMENTO("grama"));
        leafBlade.setMaxUsos(1 + new Random().nextInt(2));
        leafBlade.setUsos(leafBlade.getMaxUsos());

        Statics.setGOLPE("razorLeaf", razorLeaf);
        Statics.setGOLPE("vineWhip", vineWhip);
        Statics.setGOLPE("bulletSeed", bulletSeed);
        Statics.setGOLPE("leafBlade", leafBlade);

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

        Statics.setGOLPE("bubble", bubble);
        Statics.setGOLPE("bubbleBeam", bubbleBeam);
        Statics.setGOLPE("waterGun", waterGun);
        Statics.setGOLPE("iceBeam", iceBeam);

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

        Statics.setGOLPE("hyperFang", hyperFang);
        Statics.setGOLPE("tackle", tackle);
        Statics.setGOLPE("bite", bite);
        Statics.setGOLPE("thunderbolt", thunderbolt);

    }

    public static void inicializaStatics() {
        inicializaElementos();
        inicializaGolpes();
    }
}

