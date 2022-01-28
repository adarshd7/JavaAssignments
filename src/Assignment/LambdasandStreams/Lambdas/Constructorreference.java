package Assignment.LambdasandStreams.Lambdas;

public class Constructorreference {
    class Movie{
        Movie(int id){}
        Movie(int id,String s){}
    }
    interface Moviefactory{
        Movie create(int id);
    }
    Moviefactory mf=(id)->new Movie(id);

    public static void main(String[] args) {
        Constructorreference cf=new Constructorreference();
    }
}
