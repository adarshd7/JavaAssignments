package Assignment.Assignment7.Question4;

class TriCycleFactory implements CycleFactory{

    @Override
    public Cycle getNewCycle() {
        return new TriCycle();
    }
}
