
import java.util.*;

/**
 * 
 */
class Run{
   public String toString(){
	return("Run");		
   }
}

class Skid{
   public String toString(){
	return("Skid");
   }
}
public class Fighter {

    /**
     * Default constructor
     */
    Run run;
    Skid skid;
    Kick kick;
    Punch punch;
    Roll roll;
    public Fighter() {
	run=new Run();
	skid=new Skid();
    }

     public void changeStrategy(){
	Scanner s=new Scanner(System.in);
	System.out.println("1:Kick,2:Punch,3:Roll");
	switch(s.nextInt()){
	 case 1:System.out.println("1:Push Kick,2:Bicycle Kick");
		switch(s.nextInt()){
		case 1: kick=new PushKick();break;
		case 2: kick=new BicycleKick();break;
	}break;
	 case 2:System.out.println("1:Jump punch,2:Crouch punch");
		switch(s.nextInt()){
		case 1: punch=new JumpPunch();break;
		case 2: punch=new CrouchPunch();break;
	}break;
	 case 3:System.out.println("1:SlidingRoll,2:JumpRoll");
		switch(s.nextInt()){
		case 1: roll=new SlidingRoll();break;
		case 2: roll=new JumpRoll();break;
	}break;
    }
    }
   

    public void implementStrategy(){
    System.out.println(run);
    System.out.println(skid);
    if(kick!=null)
        System.out.println(kick);
    if(punch!=null)
        System.out.println(punch);
    if(roll!=null)
        System.out.println(roll);
    }
}
