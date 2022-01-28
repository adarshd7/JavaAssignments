package Assignment.LambdasandStreams;

import com.sun.source.util.SourcePositions;

import java.net.SocketOption;

public class TargetType {
    interface Email{
        String getEmail(String a);
    }
    void printMail(String a,Email e){
        System.out.println(e.getEmail(a));
    }

    public static void main(String[] args) {
        Email e =(String s)->s+"@zemosolabs.com";
        new TargetType().printMail("Adarsh",e);
        new TargetType().printMail("Adarsh.D",(String s)->s+"@zemosolabs.com");
    }
}
