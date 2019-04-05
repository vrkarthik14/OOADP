
import java.util.*;

/**
 * 
 */
public abstract class ResFactory {

    /**
     * Default constructor
     */
    public ResFactory() {
    }

    /**
     * @return 
     *  
     */
    public abstract DisplayDriver getDisplayDrivers();

    /**
     * @return 
     * 
     */
    public abstract PrintDriver getPrintDrivers();

}