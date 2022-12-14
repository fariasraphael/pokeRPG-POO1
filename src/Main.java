import classes.abstracts.Pokemon;
import classes.pokemons.Bulbassaur;
import classes.pokemons.Charmander;
import classes.sistema.Elemento;
import classes.sistema.Statics;

public class Main {
    public static void main(String[] args) {
        inicializaElementos();

        Pokemon jefferson = new Charmander("Jefferson");
        System.out.printf("Pokemon criado %s\n", jefferson);
        Pokemon jeffao = jefferson.evolui();
        System.out.printf("%s evolui para %s\n", jefferson, jeffao);

    }

    private static void inicializaElementos() {
        // inicializando os 3 elementos basicos FOGO, AGUA, GRAMA
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
}