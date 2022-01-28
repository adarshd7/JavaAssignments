package Assignment.LambdasandStreams.Interfaces;

public class FunctionalInterfaceAnnotation {
    interface Cruncher {
        int crunch(int i, int j);
    }

    public int crunchService(int i, int j, Cruncher cruncher) {
        return cruncher.crunch(i, j);
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnnotation client = new FunctionalInterfaceAnnotation();
        //client1
        Cruncher c= (i,j)->i+j;
        int ans=client.crunchService(12,8,c);
        System.out.println(ans);
        //client2
        ans=client.crunchService(12,8,(i,j)->i-j);
        System.out.println(ans);
        //client3
        ans=client.crunchService(12,8,(i,j)->i*j);
        System.out.println(ans);
        //client4
        ans=client.crunchService(12,8,(i,j)->i/j);
        System.out.println(ans);
    }
}
