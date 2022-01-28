package Assignment.LambdasandStreams.Interfaces;

public class FunctionalInterface {
    interface Multiplier{
        int multiply(int i,int j);
    }                       //This is a Functional Interface
    Multiplier m= (int i,int j)-> i + j;

    public static void main(String[] args) {
        FunctionalInterface fi = new FunctionalInterface();
    }

}
