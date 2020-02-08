package pl.MR;

import pl.MR.actor.Ghul;
import pl.MR.actor.Goblin;
import pl.MR.actor.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterCreationUtil {

    public static List<Monster> createMonster(){
        int howManyMonsters = new Random().nextInt(4);
        List<Monster> monstersList= new ArrayList<>();
        for (int i=0; i<howManyMonsters; i++){
            int monsterType = new Random().nextInt(2);
            if (monsterType == 0) {
                monstersList.add(new Goblin());
            } else {
                monstersList.add(new Ghul());
            }

        }
        return monstersList;
    }
}
