package Assignment.Assignment7.Question1;

public class Hamster extends Rodent {
    Hamster(){
        System.out.println("this is hamster class");
    }

    @Override
    void size() {
        System.out.println("Average size is 2-13 inches");
    }

    @Override
    void hasTail() {
        System.out.println("it has small tail");
    }
}