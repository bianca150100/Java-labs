package candy;

public class CandyBag {
    private final int nrMax;
    CandyBox [] cutii;
    private int index;

    public CandyBag(int nrMax) {
        if (nrMax > 0) {
            this.nrMax = nrMax;
            this.cutii = new CandyBox[nrMax];
        } else {
            throw new RuntimeException("Nu ati introdus un nr intreg pozitiv");
        }
    }

    public void adaugaCutie(CandyBox cut) {
        if (index < cutii.length) {
            cutii[index++] = cut;


        }
    }

    public static void main(String[] args) {
        CandyBag bag = new CandyBag(4);
        Heidi a =new Heidi("Heidi", "Switzerland", 3);
        bag.adaugaCutie(a);
        Lindt b= new Lindt("Lindt", "Switzerland", 4);
        bag.adaugaCutie(b);
        Milka c= new Milka("Milka", "Switzerland", 3, 2 );
        bag.adaugaCutie(c);
        Heidi e=new Heidi("Heidi", "Switzerland", 3);
        bag.adaugaCutie(e);

        CandyBox x = bag.cutii[0];
        CandyBox y = bag.cutii[2];

        System.out.println(x.equals(y));


        for (int i=0; i<bag.cutii.length;i++)
        {
            CandyBox k=bag.cutii[i];
            System.out.println(k);
            if (k instanceof Milka)
                ((Milka)k).printMilkadim();
            if (k instanceof Heidi)
                ((Heidi)k).printHeididim();
            if (k instanceof Lindt)
                ((Lindt)k).printLindtdim();

        }




    }

}
