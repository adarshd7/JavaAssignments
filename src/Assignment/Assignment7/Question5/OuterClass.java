package Assignment.Assignment7.Question5;

public class OuterClass {
    OuterClass(){
        System.out.println("first Outer Class");
    }
    class InnerClass{
        InnerClass(String msg){
            System.out.println(msg);
        }

    }

}

