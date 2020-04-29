package ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new CmpStudent());
        String[] siruri = {"Ana", "Ioana", "Ana", "David", "Maria", "Maria"};
        for (int i = 0; i < siruri.length; i++) {
            Student s = new Student(siruri[i],1);
            if (students.contains(s)) {
                System.out.println("Elev duplicat");

            }
            else
                students.add(s);

        }
        System.out.println(students.size());

        Map<Integer, Student> map = new HashMap<Integer, Student>();
        for (int i = 0; i < siruri.length; i++) {
            Student s = new Student(siruri[i], 1);
            if (map.containsValue(s))
            {
                System.out.println("Duplicat!");
            }
            else
                map.put(s.hashCode(),s);
        }
        System.out.println(map.size());

    }


}
