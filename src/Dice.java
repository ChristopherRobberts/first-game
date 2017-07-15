/**
 * Created by Chris on 2017-06-25.
 */
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    static final int MAXIMUM_NUMBER_OF_ROLLS = 5;
    static final int NUMBERS_ON_DICE = 6;
    private Player player = new Player();
    private int diceRollNumber;
    private int randomNum;
    private String name = "";

    public Dice(String name){
        name = player.getName();
        this.name = name;
    }

    public int diceRoll(){
        randomNum = ThreadLocalRandom.current().nextInt(1, NUMBERS_ON_DICE);
        return randomNum;
    }

    public int addRandomNumbers(){
        int counter = 0;

        for(int i = 0; i < MAXIMUM_NUMBER_OF_ROLLS; i++) {
                diceRoll();
                counter += randomNum;
        }
        return counter;
    }

    public void reset(){
        diceRollNumber = 0;
    }
}
