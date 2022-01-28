package Assignment.adarsh.assignment5.singleton;

public class Singleton {

        String stringVar;
        public static Singleton setString(String s){
            Singleton temp= new Singleton();
            temp.stringVar="s";
            return  temp;
        }
        public  void printString(){
            System.out.println("class member stringVar: "+this.stringVar);
        }
}
