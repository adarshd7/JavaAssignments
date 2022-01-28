package Assignment.Assignment7.Question4;

class UniCycleFactory implements CycleFactory{

    @Override
    public Cycle getNewCycle() {
        return new UniCycle();
    }
}