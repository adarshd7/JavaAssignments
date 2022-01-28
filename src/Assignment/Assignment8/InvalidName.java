package Assignment.Assignment8;

public class InvalidName extends Exception{
    public InvalidName(){
        System.out.println("Name can't be empyt");
    }
    public InvalidName(String message){
        super(message);
    }
}
