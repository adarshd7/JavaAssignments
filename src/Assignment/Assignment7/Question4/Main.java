package Assignment.Assignment7.Question4;

public class Main {
    public static void main(String[] args) {
        CycleFactory cyclefactory=new UniCycleFactory();
        Cycle cycle = cyclefactory.getNewCycle();
        cycle.getCycle();
    }
}
