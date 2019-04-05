
import java.util.*;

/**
 * 
 */
public class Vehicle {

    /**
     * Default constructor
     */
    public Vehicle(int i) {
        Time=i;
        Workshop wo1=new Body();
        Workshop wo2=new Paint();
        Workshop wo3=new Furnish();
        w=new ArrayList();
        w.add(wo1);w.add(wo2);w.add(wo3);
    }

    /**
     * 
     */
    public int Time;

    /**
     * 
     */
    public ArrayList<Workshop> w;


    /**
     * 
     */
    public void build() {
        // TODO implement here
        for(Workshop wo:w){
            wo.doWork(this);
        }
        System.out.println(this+"is built");
    }

}