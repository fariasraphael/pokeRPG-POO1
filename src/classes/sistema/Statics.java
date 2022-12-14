package classes.sistema;

import java.util.HashMap;
import java.util.Map;

public class Statics {
    private static Map<String, Elemento> ELEMENTOS = new HashMap<>();

    public static Elemento getELEMENTO(String key) {
        return ELEMENTOS.get(key);
    }

    public static void setELEMENTO(String key, Elemento elemento) {
        ELEMENTOS.put(key, elemento);
    }
}

