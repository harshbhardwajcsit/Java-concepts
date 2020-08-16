package main.com.rpg;

public class GameResult {
    Long score;
    Actor gameWinner;

    GameResult(){}

    GameResult(Long score, Actor gameWinner){
        this.score = score;
        this.gameWinner = gameWinner;
    }
}
