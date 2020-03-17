package candy;

public class Heidi  extends  CandyBox{
    private float dimensiune;

    Heidi(){
        super();
        this.dimensiune=0;
    }

    Heidi(String a, String b, float c)
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

    public void printHeididim()
    {
        System.out.println(this.dimensiune );
    }
}
