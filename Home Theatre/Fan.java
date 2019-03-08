package facade;
import java.util.*;

/**
 * 
 */
public class Fan {

    /**
     * Default constructor
     */
    public Fan() {
    	System.out.println("Default");
    }

    /**
     * 
     */
    public void on() {
        // TODO implement here
    	System.out.println("Fan is on");
    }

    /**
     * 
     */
    public void off() {
        // TODO implement here
    	System.out.println("Fan turned off");
    }

    /**
     * 
     */
    public void speed() {
        // TODO implement here
    	System.out.println("Input the speed");
    	Scanner s=new Scanner(System.in);
    	char c=s.next().charAt(0);
    	System.out.println("Fan speed is "+c);
    }

}
