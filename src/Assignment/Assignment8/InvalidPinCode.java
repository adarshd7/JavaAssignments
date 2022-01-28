package Assignment.Assignment8;

public class InvalidPinCode extends Exception{
    public InvalidPinCode(){
        System.out.println("Invalid Pin Code it must be 4 digits");
    }
    public InvalidPinCode(String message){
        super(message);
    }
}
