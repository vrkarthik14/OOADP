
import java.util.*;

/**
 * 
 */
public class Type3 implements Factory {
    public Type3() {
    }

    public Pencil Product1;
    public Broom Product2;
    public void getProduce() {
        // TODO implement here
        System.out.println(Product1+" and  "+Product2+" are produced here");
    }

}