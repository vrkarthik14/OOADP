import java.util.*;
public class User{
public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the cost of 3 items");
        Item1 i1=new Item1(s.nextInt());
        Item2 i2=new Item2(s.nextInt());
        Item3 i3=new Item3(s.nextInt());
        System.out.println("1:Item 1,2:Item 2,3:Item 3");
        while(true){
        int ch=s.nextInt();
        if(ch==4) break;
        System.out.println("1:pay,2:Change method,3:display");
        int cc=s.nextInt();
        switch(ch){
        case 1:if(cc==1) {i1.pay();break;}
               if(cc==2) {i1.change();break;}
               if(cc==3) {i1.display();break;}
        case 2:if(cc==1) {i2.pay();break;}
               if(cc==2) {i2.change();break;}
               if(cc==3) {i2.display();break;}
        case 3:if(cc==1) {i3.pay();break;}
               if(cc==2) {i3.change();break;}
               if(cc==3) {i3.display();break;}
         }
        }
}
}
