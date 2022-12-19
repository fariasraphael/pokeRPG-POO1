package classes.sistema;

import classes.abstracts.Pokemon;
import classes.abstracts.Treinador;
import classes.pokemons.*;

import java.util.ArrayList;
import java.util.List;

public class Batalha {
    private List<Treinador> npcList = new ArrayList<>();

    public Batalha() {
        this.configureNPCs();

    }

    private void configureNPCs() {
        Treinador npc1 = new NPC("Leon");
        npc1.getPokemons().add(new Chikorita("chikorita"));
        npc1.getPokemons().add(new Krabby("krabby"));
        npc1.getPokemons().add(new Chikorita("chikorita"));
        npcList.add(npc1);

        Treinador npc2 = new NPC("Cynthia");
        npc2.getPokemons().add(new Poliwag("poliwag"));
        npc2.getPokemons().add(new Ponyta("ponyta"));
        npc2.getPokemons().add(new Psyduck("psyduck"));
        npcList.add(npc2);

        Treinador npc3 = new NPC("Steven");
        npc3.getPokemons().add(new Treecko("treecko"));
        npc3.getPokemons().add(new Turtwig("turtwig"));
        npc3.getPokemons().add(new Vulpix("vulpix"));
        npcList.add(npc3);
    }

    public void listaNPC(){
        System.out.println("Seus adversários são:");
        for (int i=0;i<npcList.size();i++) {
            System.out.println(npcList.get(i).getName());
        }
    }

    public NPC getNPC(Integer index){
        return (NPC) npcList.get(index);
    }


}
