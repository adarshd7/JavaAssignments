package Assignment.Assignment6.Question4;

public class Main {
    Main(String msg){
        System.out.println(msg);

    }

    public static void main(String[] args) {
        Main m=new Main("hello");
        Main[] mymain=new Main[3];
        mymain[0]=new Main("object1");
        mymain[0]=new Main("object2");
        mymain[0]=new Main("object3");
    }
}
