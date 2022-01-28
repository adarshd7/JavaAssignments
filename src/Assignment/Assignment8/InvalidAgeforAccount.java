package Assignment.Assignment8;

public class InvalidAgeforAccount extends Exception{
    public InvalidAgeforAccount(){
        System.out.println("Invalid age to get Account");
    }
    public InvalidAgeforAccount(String message){
        super(message);
    }
}
