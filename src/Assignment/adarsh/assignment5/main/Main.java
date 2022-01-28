package Assignment.adarsh.assignment5.main;


import Assignment.adarsh.assignment5.singleton.Singleton;
import Assignment.adarsh.assignment5.data.Assignment5;

public class Main {
    public static void main(String[] args) {
        Assignment5 obj=new Assignment5();
        obj.getValues();
        obj.printValues();
        Singleton newObj= Singleton.setString("Static method in Singleton class");
        newObj.printString();
    }
}
