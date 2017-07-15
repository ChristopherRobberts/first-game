/**
 * Created by Chris on 2017-06-25.
 */
public class GameInitialization {

    private Player player = new Player();
    private Player player2 = new Player();
    private Dice dice = new Dice(player.getName());
    private Dice diceTwo = new Dice(player2.getName());

    public void initializeGame(){
        dice.reset();
        diceTwo.reset();
        player.registerPlayerName();
        player2.registerPlayerName();
        System.out.println("welcome " + player.getName() + " & " + player2.getName());
    }

    public void gameResults(){
        int playerOneResults = dice.addRandomNumbers();
        int playerTwoResults = diceTwo.addRandomNumbers();
        System.out.println("Player " + player.getName() + " rolled : " + playerOneResults);
        System.out.println("Player " + player2.getName() + " rolled : " + playerTwoResults);
        if(playerOneResults > playerTwoResults){
            System.out.println("Congratulations " + player.getName() + ", You should" +
                    " become a hearthstone champion!");
        }
        else{
            System.out.println("Congratulations " + player2.getName() + ", You should " +
                    " become a hearthstone champion!");
        }
    }
    public void terminate(){
        System.out.println("Thank you for playing.");
    }
}
