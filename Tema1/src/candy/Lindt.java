package candy;

public class Lindt extends CandyBox {
    private float dimensiune;

    Lindt(){
        super();
        this.dimensiune=0;
    }

    Lindt(String a, String b, float c)
    {
        super(a,b);
        this.dimensiune=c;
    }

    @Override
    public float get_volume() {
        return dimensiune*dimensiune*dimensiune;
    }

    @Override
    public String toString() {
        return super.toString()+ " cu volumul " + get_volume();
    }

    public void printLindtdim()
    {
        System.out.println(this.dimensiune );
    }
}
