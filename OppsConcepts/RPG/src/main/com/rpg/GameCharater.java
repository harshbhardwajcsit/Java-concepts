package main.com.rpg;

public class GameCharater {
    String characterName;
    Long id;

    public Long getId() {
        return id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
