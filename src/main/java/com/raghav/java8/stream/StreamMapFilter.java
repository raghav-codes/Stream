ackage com.raghav.java8.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();

       s1.add("raghav");
       s1.add("aarav");
       s1.add("shalini");

        Comparator<String> comp = (i1, i2)->i1.compareTo(i2 );

        List<String> s2 =  s1.stream().sorted(comp).collect(Collectors.toList());

        System.out.println( s2);

    }
}
