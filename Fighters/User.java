import java.util.*;
public class User{
    public static void main(String args[]){
        Fighter1 f1=new Fighter1();
        Fighter2 f2=new Fighter2();
        Fighter3 f3=new Fighter3();
        Scanner s=new Scanner(System.in);
        System.out.println("1:Fighter 1,2:Fighter 2,3:Fighter 3,4:Exit");
        while(true){
         int ch=s.nextInt();
         if(ch==4) break;
         System.out.println("1:Implement strategy,2:Change Strategy");
         int cc=s.nextInt();
         switch(ch){
                case 1:if(cc==1) f1.implementStrategy();
                        else if(cc==2) f1.changeStrategy();
                        break;
                case 2:if(cc==1) f2.implementStrategy();
                        else if(cc==2) f2.changeStrategy();
                        break;
                case 3:if(cc==1) f3.implementStrategy();
                        else if(cc==2) f3.changeStrategy();
                        break;
         }
        }
    }
}
