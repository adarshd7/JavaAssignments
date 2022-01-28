package Assignment.Assignment7.Question1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<Rodent>();
        rodents.add(new Mouse());
        rodents.add(new Gerbil());
        rodents.add(new Hamster());
        for(Rodent rodent:rodents){
            rodent.hasTail();
            rodent.size();

        }
    }
}