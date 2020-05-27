package candy;

public class CandyBox {

    private String flavour;
    private String origin;

    public CandyBox()
    {
        this.flavour="";
        this.origin="";
    }

    public CandyBox(String a, String b)
    {
        this.flavour=a;
        this.origin=b;
    }

    public float get_volume()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("Flavour: "+ flavour + "  " + "Originea: " + origin);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        CandyBox cutie= (CandyBox) obj;
        return flavour.equals(cutie.flavour);
    }
    }

