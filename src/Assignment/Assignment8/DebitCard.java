package Assignment.Assignment8;

import java.util.Scanner;
class DebitCard{
    public static String name;
    public static int age;
    private static String pin;
    public static void eligibleToGetDebitCard(String name, int age,String pin) throws InvalidAgeforAccount, InvalidName, InvalidPinCode{
        if (age < 18) {
            throw new InvalidAgeforAccount();
        }
        else if (name.isEmpty()){
            throw new InvalidName();
        }
        if(pin.length()<4  && pin.length()>=5){
            throw new InvalidPinCode();
        }
    }


       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name,Age AND PIN of Person");
        name=sc.next();
        age=sc.nextInt();
        pin=sc.next();
        try{
            eligibleToGetDebitCard(name,age,pin);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
    System.out.println("All three Exceptions are covered");
        }

    }
}

