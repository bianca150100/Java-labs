package imutabilitate;

public final class Persoana {
       private final int id;
       private final String nume;
       private final Adresa adresa;

    public Persoana(int id, String nume, Adresa a) {
        this.nume = nume;
        this.id=id;
       // Adresa copieAdr= new Adresa(a.getStrada(),a.getNumar());
       // this.adresa=copieAdr;
        this.adresa=new Adresa(a);
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
      //  Adresa copieAdr= new Adresa(adresa.getStrada(),adresa.getNumar());
       // return copieAdr;
        return new Adresa(adresa);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", adresa=" + adresa +
                '}';
    }
}
