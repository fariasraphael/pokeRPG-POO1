package classes.sistema;

import java.util.HashMap;
import java.util.Map;

public class StaticsGolpe {
    //Codigo para ser inserido na class Statics
    private static Map<String, Golpe> GOLPES = new HashMap<>();

    public static Golpe getGOLPE(String key) {
        return GOLPES.get(key);
    }

    public static void setGOLPE(String key, Golpe golpe) {
        GOLPES.put(key, golpe);
    }
}
