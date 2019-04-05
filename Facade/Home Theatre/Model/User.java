package facade;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    	status=new Facade();
    }

    /**
     * 
     */
    public Facade status;


    /**
     * 
     */
    public void watch() {
        // TODO implement here
    	status.on();
    }

    /**
     * 
     */
    public void end() {
        // TODO implement here
    	status.off();
    }
    
    public static void main(String args[]){
    	User u=new User();
    	u.watch();
    	u.end();
    }
}
