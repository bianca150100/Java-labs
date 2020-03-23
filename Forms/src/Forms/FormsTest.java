package Forms;

public class FormsTest {
    private int n;
    Form [] forme;

    public FormsTest(int n)
    {
        if (n>0)
        {
            this.n =n;
            this.forme= new Form [n];
        }
    }

    public void adauga(Form a, int index)
    {
        forme[index] = a;
    }
    public static void main (String[] args){
        FormsTest f = new FormsTest(4);
        Triangle a = new Triangle(3, 4, "rosu");
        f.adauga(a,0);
        Circle b = new Circle("verde", 1);
        f.adauga(b,1);
        Triangle c = new Triangle(2,2,"negru");
        f.adauga(c,2 );
        Circle d= new Circle("roz",1.2f );
        f.adauga(d,3);
        for (int i=0;i<4;i++)
            System.out.println(f.forme[i]);

        for (int i=0;i<4;i++)
        {
            Form k = f.forme[i];
            System.out.println(k);
            if (k instanceof Circle)
                ((Circle)k).print_dim_cerc();
            if (k instanceof Triangle)
                ((Triangle)k).print_dim_tr();
            System.out.println("\n");
        }


    }
}
