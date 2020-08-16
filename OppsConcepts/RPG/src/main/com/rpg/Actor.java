package main.com.rpg;
public class Actor extends GameCharater {

    public Long level;
    public Power powers;
    public CharacterRole role;

    Actor(Long id, String name, CharacterRole role, Long level, Power powers){
        this.id =  id;
        this.characterName = name;
        this.role = role;
        this.level = level;
        this.powers = powers;
    }

    public Power getPowers() {
        return powers;
    }

    public Long getLevel() { return level; }
}
