package collections.list.arraylis;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> ints= new ArrayList<>(10);
        ints.add(1);
        ints.add(1);
        ints.add(1);
        ints.add(1);
        System.out.println(ints);
        ints.add(3,18);
        ints.set(2,10);
        System.out.println(ints);

        System.out.println(ints.indexOf(1));
        System.out.println(ints.lastIndexOf(1));


        System.out.println(ints);
        ints.remove(2);
        System.out.println(ints);
        ints.remove(Integer.valueOf(1));
        System.out.println(ints);

        List<Integer> sublist= new ArrayList<>();
        sublist= ints.subList(0,ints.size());
        System.out.println(sublist);

    }
}
