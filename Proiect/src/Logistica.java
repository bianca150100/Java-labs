import java.util.ArrayList;
import java.util.Iterator;

public class Logistica {
        private int index;
        ArrayList<Dotare> produse_cabinet = new ArrayList<Dotare>(10);
        ArrayList<Dotare> medicamente_expirate= new ArrayList<Dotare>(10);
        ArrayList<Dotare> aparate_casate= new ArrayList<Dotare>(10);

    public Logistica(int index, ArrayList<Dotare> produse_cabinet) {
        this.index = index;
        this.produse_cabinet = produse_cabinet;
    }

    public Logistica() {
        this.index=0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayList<Dotare> getProduse_cabinet() {
        return produse_cabinet;
    }

    public void setProduse_cabinet(ArrayList<Dotare> produse_cabinet) {
        this.produse_cabinet = produse_cabinet;
    }

    public ArrayList<Dotare> getMedicamente_expirate() {
        return medicamente_expirate;
    }

    public void setMedicamente_expirate(ArrayList<Dotare> medicamente_expirate) {
        this.medicamente_expirate = medicamente_expirate;
    }

    public ArrayList<Dotare> getAparate_casate() {
        return aparate_casate;
    }

    public void setAparate_casate(ArrayList<Dotare> aparate_casate) {
        this.aparate_casate = aparate_casate;
    }

    public void adauga_produs(Dotare d)
    {
        this.produse_cabinet.add(d);
        this.index ++;

    }

    public void sterge_produs(Dotare d)
    {
        this.produse_cabinet.remove(d);
        this.index--;
    }

    public void caseaza_produse()
    {

        for (int i=0;i< this.produse_cabinet.size(); i++)
        {
            Dotare dot = this.produse_cabinet.get(i);
            if (dot instanceof Medicament)
            {
                System.out.println("si aici");
                if (dot.verifica_valabilitate())
                {
                    System.out.println("a intrat");
                    medicamente_expirate.add(dot);

                }}
            if (dot instanceof Ustensile_Aparatura)
                if(dot.verifica_valabilitate())
                {
                   // System.out.println("aici");

                    aparate_casate.add(dot);

                }
        }
        Iterator <Dotare> itr= this.produse_cabinet.iterator();
        while (itr.hasNext())
        {   Dotare dot = itr.next();
            if(dot.verifica_valabilitate())
                itr.remove();}

    }

    @Override
    public String toString() {
        return "Evidenta: "
                  + produse_cabinet +
                ", medicamente_expirate: " + medicamente_expirate +
                ", aparate_casate: " + aparate_casate +
                '}';
    }
}
