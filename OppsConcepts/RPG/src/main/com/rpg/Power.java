package main.com.rpg;

import java.util.List;

public class Power {

    List<Attack> attackingPowers;
    List<Defence> defendingPowers;

    Power(List<Attack> attackingPowers, List<Defence> defendingPowers){
        this.attackingPowers = attackingPowers;
        this.defendingPowers = defendingPowers;
    }
    public void setAttackingPowers(List<Attack> attackingPowers) {
        this.attackingPowers = attackingPowers;
    }

    public void setDefendingPowers(List<Defence> defendingPowers) {
        this.defendingPowers = defendingPowers;
    }

    public List<Attack> getAttackingPowers() {
        return attackingPowers;
    }

    public List<Defence> getDefendingPowers() {
        return defendingPowers;
    }

    public static Attack prepareAttack(AttackCategory attackCategory, Long attackDamage){
        return new Attack(attackCategory, attackDamage);
    }

    public static Defence prepareDefence(DefenceCategory defenceCategory, Long defenceLevel){
        return new Defence(defenceCategory, defenceLevel);
    }
}
