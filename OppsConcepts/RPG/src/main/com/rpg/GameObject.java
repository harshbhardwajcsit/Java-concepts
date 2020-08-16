package main.com.rpg;

public class GameObject {
    Actor hero;
    Actor villain;

    GameObject(){}

    GameObject(Actor hero, Actor villain){
        this.hero = hero;
        this.villain = villain;
    }
}
