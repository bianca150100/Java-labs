package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> arr = new ArrayList<>();

        String[] siruri = {"Ana", "Ioana", "Ana", "David", "Maria", "Maria"};
        for (int i = 0; i < siruri.length; i++) {
            Student s = new Student(siruri[i], 1);
            arr.add(s);
        }
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s);
            for (Student s2 : arr) {
                System.out.println("\t" + s2 + " " + s.equals(s2) + " " + ((Object) s).equals(s2));

            }
        }
    }
}
