
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    public static Shape shape;


    /**
     * 
     */
    public static void drawShape() {
        // TODO implement here
        shape.draw();
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("1:Square,2:Rectangle,3:Triangle,4:End");
        while(true){
            int ch=s.nextInt();
            if(ch==4) break;
            switch(ch){
                case 1: shape=new Square();
                        break;
                case 2: shape=new Rectangle();
                        break;
                case 3:shape=new Triangle();
                        break;
                default:shape=null;
            }
            if(shape==null)System.out.println("Wrong Choice");
            else drawShape();
        }
    }
}