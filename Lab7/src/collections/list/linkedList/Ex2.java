package collections.list.linkedList;

import java.util.LinkedList;

public class Ex2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aa");
        list.offer("cc");
        list.offerFirst("rr");
        System.out.println(list);
        System.out.println(list.element());
      //  new LinkedList<>.element();
        LinkedList <String> empty = new LinkedList<>();

        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list);

        empty.poll();
        //empty.pop();

    }
}
