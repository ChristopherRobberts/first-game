/**
 * Created by Chris on 2017-07-02.
 */
import java.util.*;
public class RestartGame {
    private GameInitialization gameInitialization = new GameInitialization();

    public RestartGame(){

    }

    public void restart(){
        Scanner in = new Scanner(System.in);
        System.out.print("Do you wish to play again? (Y/N) : ");
        String stringAnswer = in.nextLine();
        while(stringAnswer.length()!=0) {
            if (stringAnswer.equals(answerYes())) {
                gameInitialization.initializeGame();
                gameInitialization.gameResults();
                stringAnswer = "";
                RestartGame restartGame = new RestartGame();
                restartGame.restart();
            }
            else if (stringAnswer.equals(answerNo())) {
                gameInitialization.terminate();
                break;
            }
            else {
                while(true) {
                    System.out.print("Please enter either (Y/N) : ");
                    stringAnswer=in.nextLine();
                    if(stringAnswer.equals(answerYes())) {
                        gameInitialization.initializeGame();
                        gameInitialization.gameResults();
                    }
                    else if(stringAnswer.equals(answerNo())){
                        break;
                    }
                }
            }
        }
    }

    public static String answerYes(){
        return "Y";
    }

    public static String answerNo(){
        return "N";
    }
}
