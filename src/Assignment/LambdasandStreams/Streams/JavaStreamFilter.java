package Assignment.LambdasandStreams.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamFilter {
    public static void main(String[] args) {


    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
    List<Integer> squaresofnum = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(squaresofnum);

}
}

