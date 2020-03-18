package Array;

import java.util.Random;

public class MyArrayListTest {

    public static void main(String[] args)
    {   int i;
        MyArrayList l = new MyArrayList(10);
        l.add(3);
        l.add(4);
        l.add(100);
        //for (i=0;i<3;i++)
          //  System.out.println(l.get(i));
        //System.out.println(l.size());
        scenariu1();
    }

    public static void scenariu1()
    {
        MyArrayList ll=new MyArrayList(5);
        Random rand= new Random();
        for (int i=0;i<10;i++)
        {
            float k= rand.nextFloat();
            System.out.println(k);
            ll.add(k);

        }
        for(int i=0;i<10;i++)
        {
            System.out.println(ll.get(i));
        }

    }
}
