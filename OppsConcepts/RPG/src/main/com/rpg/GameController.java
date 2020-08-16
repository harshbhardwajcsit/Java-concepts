package main.com.rpg;

import sun.jvm.hotspot.oops.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;

public abstract class GameController {

    public abstract GameResult StartFight(GameObject gameObject);

    public GameObject gameInitializer(){

        // adding game object
        List<Attack> heroAttackingPowers = Arrays.asList(new Attack(AttackCategory.KICK,2L), new Attack(AttackCategory.PUNCH, 1L));
        List<Defence> heroDefendingPowers = Arrays.asList(new Defence(DefenceCategory.SHIELD_DEFENCE,2L), new Defence(DefenceCategory.INVISIBLE, 4L));
        Hero hero = new Hero(1L,"Army", CharacterRole.HERO, 1L, new Power(heroAttackingPowers, heroDefendingPowers));

        List<Attack> villainAttackingPowers = Arrays.asList(new Attack(AttackCategory.BITE,2L), new Attack(AttackCategory.POISON, 6L));
        List<Defence> villainDefendingPowers = Arrays.asList(new Defence(DefenceCategory.SHIELD_DEFENCE,2L), new Defence(DefenceCategory.HAND_DEFENCE, 4L));
        Zombie villain = new Zombie(1L,"ZO", CharacterRole.HERO, 1L, new Power(villainAttackingPowers, villainDefendingPowers));
        return new GameObject(hero, villain);
    }
}
