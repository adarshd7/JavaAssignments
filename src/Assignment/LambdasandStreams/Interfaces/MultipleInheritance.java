package Assignment.LambdasandStreams.Interfaces;

interface EnginE
{
    default String model(int id)
    {
        return "default engine";
    }
}
class CaR implements EnginE,VehiclE
{
    public String model(int id)
    {
        //return "default car";
        return VehiclE.super.model(id);
    }
    String getModel(int id)
    {
        return model(id);
    }
}
interface VehiclE extends EnginE
{
    default String model(int id)
    {
        return "default engine";
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {

    }
}