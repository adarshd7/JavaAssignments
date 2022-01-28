package Assignment.LambdasandStreams.Lambdas;

public class SimpleMath {
    interface Math{
        int add(int a,int b);
    }

    int  calc(int a,int b,Math m){
        return m.add(a,b);
    }

    public static void main(String[] args) {
        Math m=(int a,int b)->a+b;
        SimpleMath sm= new SimpleMath();
        System.out.println(sm.calc(10,20,m));
    }
}
