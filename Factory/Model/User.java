
import java.util.*;

/**
 * 
 */
public class User {
    public static void main(String args[]) {
        System.out.println("Factory 1 details:");
        Factory1 f1=new Factory1();
        f1.getProduce();
        System.out.println("Factory 2 details:");
        Factory2 f2=new Factory2();
        f2.getProduce();
        System.out.println("Factory 3 details:");
        Factory3 f3=new Factory3();
        f3.getProduce();
        System.out.println("Factory 4 details:");
        Factory4 f4=new Factory4();
        f4.getProduce();
        System.out.println("Factory 5 details:");
        Factory5 f5=new Factory5();
        f5.getProduce();
        System.out.println("Factory 6 details:");
        Factory6 f6=new Factory6();
        f6.getProduce();

    }
}