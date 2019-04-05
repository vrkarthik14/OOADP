
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
    public void getVehicle() {
        // TODO implement here
    }

    public static void main(String args[]){
        Vehicle v;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1:Bike,2:Car,3:Truck,4:exit");
        while(true){
            int ch=s.nextInt();
            if(ch==4) break;
            System.out.println("Enter the time parameter of the vehicle");
            switch(ch){
                case 1:v=new Bike(s.nextInt());break;
                case 2:v=new Car(s.nextInt());break;
                case 3:v=new Car(s.nextInt());break;
                default: v=null; break;
            }
            if(v!=null) v.build();
            else{System.out.println("Enter correct choice");}
        }
    }

}