package Assignment.LambdasandStreams.Functions;


import java.util.function.*;

public class PrimitiveFunctions {

    Predicate<Integer> intevenNumber = x->x%2==0;
    IntPredicate isinteven = x->x%2==0;
    DoublePredicate doublevenNumber = x->x%2==0;

    void testPredicate(int i){

        System.out.println("Even number?"+intevenNumber.test(i));
        System.out.println("Even number?"+ isinteven.test(i));

    }

    //Consumers
    IntConsumer intConsumer;
    DoubleConsumer doubleConsumer;
    LongConsumer longConsumer;

    //Suppliers
    IntSupplier intSupplier;
    DoubleSupplier doubleSupplier;
    LongSupplier longSupplier;

    public static void main(String[] args) {
        new PrimitiveFunctions().testPredicate(1);
    }
}