package Assignment.LambdasandStreams.Functions;

import java.util.function.Supplier;

public class SupplierFunction{
    Supplier<String[]> fruitsupplier=()->new String[]{"Apples","Mangoes"};
    public void getSupplier()
    {
        String[] Fruits= fruitsupplier.get();

        for(String fruit :  Fruits)
        {                                                       //Supplier<T>{
                                                                // void get(T t);
            System.out.println("fruits are "+fruit );           //}
        }
    }

    public static void main(String[] args)
    {
        new SupplierFunction().getSupplier();
    }

}
