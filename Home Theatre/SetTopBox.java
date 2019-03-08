package facade;

/**
 * 
 */
public class SetTopBox {

    /**
     * Default constructor
     */
    public SetTopBox() {
    	System.out.println("Default channel running");
    	status="ON";
    }

    /**
     * 
     */
    public String status;


    /**
     * 
     */
    public void on() {
        // TODO implement here
    	System.out.println("Set top box on");
    }

    /**
     * 
     */
    public void off() {
        // TODO implement here
    	System.out.println("Set top box turned off");
    }

}
