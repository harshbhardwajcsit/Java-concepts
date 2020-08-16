package main.com.rpg;

import java.lang.reflect.Array;
import java.util.List;

public class GameRunner extends GameController {

    public static void main(String[] args) {
     final GameObject gameObject = new GameRunner().gameInitializer();
     final GameResult result = new GameRunner().StartFight(gameObject);

     System.out.println(result);
    }

    @Override
    public GameResult StartFight(GameObject gameObject) {
        //todo custom game logic at each level
        return new GameResult();
    }
}
