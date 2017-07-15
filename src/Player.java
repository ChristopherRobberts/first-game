/**
 * Created by Chris on 2017-06-25.
 */
import java.util.*;
public class Player {
    Scanner in = new Scanner(System.in);
    private String name;

    public void registerPlayerName(){
        System.out.println("State player name : ");
        name = in.nextLine();
    }

    public String getName(){
        return name;
    }
}
