package collections.list.arraylis;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        //without generics
        List bulklist = new ArrayList();
        bulklist.add(12);
        bulklist.add("one");
        bulklist.add("two");
        bulklist.add(new Object());
        System.out.println(bulklist);

        List<String> list1=new ArrayList<>();
        System.out.println(list1.isEmpty());
        list1.add("one");
        list1.add("two");
        list1.add(0,"three");
        list1.add(1,"ok");
        System.out.println(list1);
        System.out.println(list1.size());

        if (list1.contains("one")) {
            System.out.println("Contains one!");
            list1.remove(0);
            list1.remove("one");
            System.out.println(list1);
        }
   //     list1.remove(3);

        List<String> list2= new ArrayList<>(list1);
        System.out.println(list2);
        list2.addAll(list2);
        System.out.println(list2);
        list2.add("last el");
        list2.removeAll(list1);
        System.out.println(list2);

        list1.clear();
        System.out.println(list1);
    }
}
