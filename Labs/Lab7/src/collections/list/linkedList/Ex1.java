package collections.list.linkedList;

import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<String> list1= new LinkedList<>();
        list1.add("one");
        list1.add(1, "two");
        list1.add("cat");
        list1.add("dog");
        list1.add("sun");
        list1.addFirst("at first");
        list1.addLast("at last");
        System.out.println(list1);

        list1.remove("two");
        list1.remove(2);
        System.out.println(list1.removeFirst());
        System.out.println(list1.removeLast());
        System.out.println(list1);
        list1.add("sun");
        list1.add("sun");
        list1.add("blue");
        list1.removeFirstOccurrence("sun");
        System.out.println(list1);

    }
}
