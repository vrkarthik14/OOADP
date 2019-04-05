
import java.util.*;

/**
 * 
 */
public class ApControl {

    /**
     * Default constructor
     */
    public static void ApControl() {
    	
    }

    /**
     * 
     */
    public static void main(String[] args) {
        // TODO implement here
    	ResFactory rf;
    	DisplayDriver dd;
    	PrintDriver pd;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter choice: 1)Low resolution drivers, 2) High resolution drivers, 3) Exit");
    	int ch = sc.nextInt();
    	while(ch!=3){
    		switch (ch) {
			case 1:
				rf = new LowResFactory();
				rf.getDisplayDrivers().display();
				rf.getPrintDrivers().print();
				break;
			case 2:
				rf = new HighResFactory();
				rf.getDisplayDrivers().display();
				rf.getPrintDrivers().print();
				break;
			case 3:
				break;
			default:
				break;
			}
    		ch = sc.nextInt();
    	}
    }

}