import classes.abstracts.Pokemon;
import classes.pokemons.Charmander;
import classes.sistema.Statics;

public class Main {
    public static void main(String[] args) {
        Statics.inicializaStatics();

        Pokemon jefferson = new Charmander("Jefferson");
        System.out.printf("Pokemon criado %s\n", jefferson);
        Pokemon jeffao = jefferson.evolui();
        System.out.printf("%s evolui para %s\n", jefferson, jeffao);

    }

}