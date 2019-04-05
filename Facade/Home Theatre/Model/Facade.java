package facade;
import java.util.*;

/**
 * 
 */
public class Facade {
	DVDPlayer d;
	Couch c;
	Fan f;
	Lights l;
	PopcornMaker p;
	SetTopBox b;
	TV t;
	CoffeeMaker cm;
	Speaker sp;

    /**
     * Default constructor
     */
    public Facade() {
    	d=new DVDPlayer();
    	c=new Couch();
    	f=new Fan();
    	l=new Lights();
    	p=new PopcornMaker();
    	b= new SetTopBox();
    	t= new TV();
    	cm=new CoffeeMaker();
    	sp=new Speaker();
		Status="ON";
    }

    /**
     * 
     */
    public String Status;






    /**
     * 
     */
    public void on() {
        // TODO implement here
    	System.out.println(Status);
    	int ch1,ch2;
    	Scanner s=new Scanner(System.in);
    	System.out.println("1:DVD player,2:Couch,3:Fan,4:TV,5:Lights,6:Popcorn Maker,7:Coffee maker,8:Speaker,9:Set Top Box,10:exit");
    	while(true){
    		ch1=s.nextInt();
    		if(ch1==10) break;
    		switch(ch1){
    		case 1: System.out.println("1:on,2:off,3:select");
    					ch2=s.nextInt();
    					if(ch2==1) d.on();
    					else if(ch2==2) d.off();
    					else if(ch2==3) d.select();
    					else System.out.println("Error");
    					break;
    		case 2: System.out.println("1:fold,2:stretch");
						ch2=s.nextInt();
						if(ch2==1) c.fold();
						else if(ch2==2) c.stretch();
						else System.out.println("Error");
    					break;
    		case 3:System.out.println("1:on,2:off,3:speed");
    				ch2=s.nextInt();
    				if(ch2==1)f.on();
    				else if(ch2==2)f.off();
    				else if(ch2==3)f.speed();
    				else System.out.println("Error");
    				break;
    		case 4:System.out.println("1:channel,2:choose operator,3:off");
    				ch2=s.nextInt();
    				if(ch2==1)t.channel();
    				else if(ch2==2)t.chooseOp();
    				else if(ch2==3)t.off();
    				else System.out.println("Error");
    				break;
    		case 5:System.out.println("1:on,2:off");
    				ch2=s.nextInt();
    				if(ch2==1)l.on();
    				else if(ch2==2) l.off();
    				else System.out.println("Error");
    				break;
    		case 6:System.out.println("1:on,2:off,3:cheese,4:caramel,5:salted");
    				ch2=s.nextInt();
    				if(ch2==1) p.on();
    				else if(ch2==2)p.off();
    				else if(ch2==3)p.cheese();
    				else if(ch2==4)p.caramel();
    				else if(ch2==5)p.salted();
    				else System.out.println("Error");
    				break;
    		case 7: System.out.println("1:on,2:off,3:black,4:filter,5:mocha,6:cappuchino");
    				ch2=s.nextInt();
    				if(ch2==1)cm.on();
    				else if(ch2==2) cm.off();
    				else if (ch2==3) cm.black();
    				else if(ch2==4) cm.filter();
    				else if(ch2==5) cm.mocha();
    				else if(ch2==6) cm.cappacino();
    				else System.out.println("Error");
    				break;
    		case 8:System.out.println("1:on,2:off,3:volume increase,4:decrease volume");
    				ch2=s.nextInt();
    				if(ch2==1)sp.on();
    				else if(ch2==2) sp.off();
    				else if(ch2==3) sp.increaseVol();
    				else if(ch2==4) sp.decreaseVol();
    				else System.out.println("Error");
    				break;
    		case 9:System.out.println("1:on,2:off");
    				ch2=s.nextInt();
    				if(ch2==1) b.on();
    				else if(ch2==2) b.off();
    				else System.out.println("Error");
    				break;
    		default: break;
    		}
    	}
    	s.close();
    }

    /**
     * 
     */
    public void off() {
        // TODO implement here
    	System.out.println("Theater OFF");
    }

}

