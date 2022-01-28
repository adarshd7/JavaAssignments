package Assignment.Assignment7.Question2;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Bicycle();                //Up Casting
        cycles[1] = new Unicycle();
        cycles[2] = new Tricycle();
        for (Cycle cycle : cycles) {
            cycle.balance();
        }
        Bicycle b = (Bicycle) new Cycle();
        Unicycle u = (Unicycle) new Cycle();
        Tricycle t = (Tricycle) new Cycle();                       //Down Casting
        b.balance();                                                //it gives compile time error
        u.balance();
        t.balance();
    }
}
