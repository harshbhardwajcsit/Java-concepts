package main.com.rpg;

public class Attack {
    AttackCategory attackName;
    Long damageLevel;

    Attack(AttackCategory attackCategory, Long damageLevel){
        this.attackName = attackCategory;
        this.damageLevel = damageLevel;
    }
}
