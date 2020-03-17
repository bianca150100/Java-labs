package candy;

public class Milka extends CandyBox {
    private float dimensiune, raza;

    Milka(){
        super();
        this.dimensiune=0;
        this.raza=0;
    }

    Milka(String a, String b, float c,float d)
    {
        super(a,b);
        this.dimensiune=c;
        this.raza=d;
    }

    @Override
    public float get_volume() {
        return dimensiune * (float)Math.PI * (raza * raza);
    }

    @Override
    public String toString() {
        return super.toString()+ " cu volumul " + get_volume();
    }

    public void printMilkadim()
    {
        System.out.println(this.dimensiune+ " " + this.raza);
    }
}
