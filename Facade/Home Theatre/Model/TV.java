package facade;
import java.util.*;

/**
 * 
 */
public class TV {

    /**
     * Default constructor
     */
    public TV() {
    	Screen="1";
    	System.out.println("TV settings default");
    }

    /**
     * 
     */
    public String Screen;
    public Scanner s=new Scanner(System.in);
    /**
     * 
     */
    public void chooseOp() {
        // TODO implement here
    	System.out.println("Enter the operator");
    	char c=s.next().charAt(0);
    	System.out.println("The operator is "+c);
    }

    /**
     * 
     */
    public void channel() {
        // TODO implement here
    	System.out.println("Enter the channel");
    	char c=s.next().charAt(0);
    	System.out.println("The channel is "+c);
    }

    /**
     * 
     */
    public void off() {
        // TODO implement here
    	System.out.println("TV is off");
    }

}
