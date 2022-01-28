package Assignment.LambdasandStreams.Interfaces;

interface Engine
{
    default String make()
    {
        return "default engine";
    }
}
interface Vehicle
{
    default String model()
    {
        return "default model";
    }
}
class Car implements Engine,Vehicle
{
    String makeAndModel()
    {
        return Engine.super.make()+Vehicle.super.model();
    }
}
public class InheritingBehaviour {
    public static void main(String[] args) {

    }
}