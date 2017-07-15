/**
 * Created by Chris on 2017-06-25.
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        GameInitialization gameInitialization = new GameInitialization();
        RestartGame restartGame = new RestartGame();
        gameInitialization.initializeGame();
        gameInitialization.gameResults();

        restartGame.restart();

    }
}
