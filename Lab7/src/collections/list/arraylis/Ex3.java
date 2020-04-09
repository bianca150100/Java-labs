package collections.list.arraylis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List <Integer> ints = Arrays.asList(2,89, 24, 92, 3,5,7,6,57,90);
        System.out.println(ints);

        Object[] arr = ints.toArray();

       // Collections.sort(ints);
        System.out.println(ints);

        System.out.println(Collections.binarySearch(ints, 3));

    }
}
