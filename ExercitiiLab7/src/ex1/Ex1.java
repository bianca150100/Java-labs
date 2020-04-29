package ex1;

import java.util.Set;
import java.util.TreeSet;

public class Ex1 {
    public static void main(String[] args) {
        Set<String> multime = new TreeSet<>();
        String[] siruri = {"Ana", "Ioana", "Ana", "David", "Maria", "Maria"};
        for (int i = 0; i < siruri.length; i++) {
            if (multime.contains(siruri[i]))
                System.out.println("Duplicat " + siruri[i]);
            else
                multime.add(siruri[i]);

        }
        System.out.println(multime.size());
    }
}
