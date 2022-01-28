package Assignment.Assignment7.Question4;

class BiCycleFactory implements CycleFactory{

    @Override
    public Cycle getNewCycle() {
        return new BiCycle();
    }
}
