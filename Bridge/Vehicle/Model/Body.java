
import java.util.*;

/**
 * 
 */
public class Body implements Workshop {

    /**
     * Default constructor
     */
    private int required;
    public Body() {
        required=3;
    }

    public String toString(){return("body.");}


    public void doWork(Vehicle v){
        System.out.println(required*v.Time+" to do the "+ this);
    }

}