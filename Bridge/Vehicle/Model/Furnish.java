
import java.util.*;

/**
 * 
 */
public class Furnish implements Workshop {

    /**
     * Default constructor
     */
    private int required;
    public Furnish() {
        required=5;
    }

    public void doWork(Vehicle v){
        System.out.println(required*v.Time+" to do the "+ this);
    }

    public String toString(){return("furnishing.");}

}