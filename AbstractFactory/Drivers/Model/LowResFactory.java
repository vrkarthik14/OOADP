
import java.util.*;

/**
 * 
 */
public class LowResFactory extends ResFactory {

    /**
     * Default constructor
     */
    public LowResFactory() {
    	lrdd = new LRDD();
    	lrpd = new LRPD();
    }

    /**
     * 
     */
    public LRDD lrdd;

    /**
     * 
     */
    public LRPD lrpd;

    /**
     * @return
     */
    public LRDD getDisplayDrivers() {
        // TODO implement here
        return lrdd;
    }

    /**
     * @return
     */
    public LRPD getPrintDrivers() {
        // TODO implement here
        return lrpd;
    }


}