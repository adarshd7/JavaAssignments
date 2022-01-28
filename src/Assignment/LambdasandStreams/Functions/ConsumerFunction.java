package Assignment.LambdasandStreams.Functions;


import java.util.function.Consumer;

public class ConsumerFunction{
    Consumer<String> printInfo=m-> System.out.println("printing out movie info : "+m);
                                                            //in built consumer function
    private void testConsumer(String movie)                 //Consumer<T>{
                                                            //  void accept(T t);  }
    {
        printInfo.accept(movie);
    }

    public static void main(String[] args) {
        String s=new String("Avengers");
        new ConsumerFunction().testConsumer(s);

    }
}