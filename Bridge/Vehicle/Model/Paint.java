
import java.util.*;

/**
 * 
 */
public class Paint implements Workshop {

    /**
     * Default constructor
     */
    private int required;
    public Paint() {
        required=1;
    }

    public void doWork(Vehicle v){
        System.out.println(required*v.Time+" to do the "+ this);
    }

    public String toString(){return("painting.");}

}