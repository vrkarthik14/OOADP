package facade;
import java.util.*;

/**
 * 
 */
public class DVDPlayer {

    /**
     * Default constructor
     */
    public DVDPlayer() {
    	System.out.println("DVD player is at default");
    }

    /**
     * 
     */
    public void on() {
        // TODO implement here
    	System.out.println("DVD player is ON");
    }

    /**
     * 
     */
    public void off() {
        // TODO implement here
    	System.out.println("DVD player is OFF");
    }

    /**
     * 
     */
    public void pause() {
        // TODO implement here
    	System.out.println("Paused");
    }

    /**
     * 
     */
    public void select() {
        // TODO implement here
    	System.out.println("Enter the track to be selected");
    	Scanner s=new Scanner(System.in);
    	char a=s.next().charAt(0);
    	System.out.println("Track "+a+"is selected");
    }

}
