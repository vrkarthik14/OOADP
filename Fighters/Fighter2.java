
import java.util.*;

/**
 * 
 */
public class Fighter2 extends Fighter {

    /**
     * Default constructor
     */
    public Fighter2() {
        kick=new BicycleKick();
        roll=new SlidingRoll();
    }
}
