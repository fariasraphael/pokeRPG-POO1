import classes.pokemons.Bulbassaur;
import classes.sistema.Elemento;
import classes.sistema.Statics;

public class Main {
    public static void main(String[] args) {
        inicializaElementos();

        new Bulbassaur("Jefferson");
    }

    private static void inicializaElementos() {
        // inicializando os 3 elementos basicos FOGO, AGUA, GRAMA
        Elemento fogo = new Elemento("fogo");
        Elemento agua = new Elemento("agua");
        Elemento grama = new Elemento("grama");

        // configurando vantagens e fraquezas
        fogo.setFraqueza(agua);
        fogo.setVantagem(grama);

        agua.setFraqueza(grama);
        agua.setVantagem(fogo);

        grama.setFraqueza(fogo);
        grama.setVantagem(agua);

        // salvando elementos no statics
        Statics.setELEMENTO("fogo", fogo);
        Statics.setELEMENTO("agua", agua);
        Statics.setELEMENTO("grama", grama);
    }
}