package Assignment.LambdasandStreams;

import Assignment.Assignment6.Question2.Main;

interface IMovie{
    boolean check(int id);
}
public class MethodReference {
    IMovie m=(id)->id<100?true:false;
    IMovie m1=MethodReference::isClassic;
    void testmovie(int i){
        System.out.println(m.check(i));
        System.out.println(m1.check(i));
    }
    static boolean isClassic(int i){
        return true;
    }

    public static void main(String[] args) {
        new MethodReference().testmovie(100);
    }
}
