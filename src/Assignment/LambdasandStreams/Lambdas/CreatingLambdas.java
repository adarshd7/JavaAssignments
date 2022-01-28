package Assignment.LambdasandStreams.Lambdas;

public class CreatingLambdas {
    interface Greeting{
        String sayHello(String a);
    }
    void sayGreeting(String a,Greeting g){
        String result = g.sayHello(a);
        System.out.println(result);
    }

    public static void main(String[] args) {
        new CreatingLambdas().sayGreeting("Adarsh",(String s)->"hello,"+s);
        new CreatingLambdas().sayGreeting("",(String s)->!s.isEmpty()?"hello"+s:"is something wrong");
    }
}
