package Assignment.LambdasandStreams.Functions;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class BiPredicateFunction {
    BiPredicate<String,String> bipredicate =(a,b)->{    //Interface
        if(a.equals(b))                                 //BiPredicate(T t,U u){
                                                        // boolean Test(t,u);
            return true;                                //}
        return false;
    };
    void testBiPredicate(String m,String n){
        System.out.println(bipredicate.test(m,n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m,n;
        System.out.println("Enter String values for m and n");
        m=sc.nextLine();
        n = sc.nextLine();
        new BiPredicateFunction().testBiPredicate(m,n);
    }
}
