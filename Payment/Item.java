
import java.util.*;

/**
 * 
 */
public class Item {

    /**
     * Default constructor
     */
    Online online;
    Offline offline;
    int cost;
    public Item(int cost) {
        this.cost=cost;
    }
    public void pay() {
        // TODO implement here
        int flag=0;
        if(online!=null)
        System.out.println(online);
        else
        System.out.println(offline);
    }

    /**
     * 
     */
    public void display() {
        // TODO implement here
        System.out.println(cost);
    }

    /**
     * 
     */
    public void change() {
        // TODO implement here
        Scanner s=new Scanner(System.in);
        System.out.println("1:offline,2:online");
        switch(s.nextInt()){
        case 1:System.out.println("1:cash,2:card");
                int c=s.nextInt();
                if(c==1) offline=new Cash();
                else if(c==2) offline=new Card();
                online=null;
                break;
        case 2:System.out.println("1:Net Banking,2:eWallet,3:BHIM");
                c=s.nextInt();
                if(c==1) online=new NetBanking();
                else if(c==2) online=new Wallet();
                else if(c==3) online=new BHIM();
                offline=null;
                break;
    }

}
}
