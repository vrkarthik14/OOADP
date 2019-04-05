
import java.util.*;

/**
 * 
 */
public class HighResFactory extends ResFactory {

    /**
     * Default constructor
     */
    public HighResFactory() {
    	hrpd = new HRPD();
    	hrdd = new HRDD();
    }

    /**
     * 
     */
    public HRDD hrdd;

    /**
     * 
     */
    public HRPD hrpd;

    /**
     * @return
     */
    public HRDD getDisplayDrivers() {
        // TODO implement here
        return hrdd;
    }

    /**
     * @return
     */
    public HRPD getPrintDrivers() {
        // TODO implement here
        return hrpd;
    }

}