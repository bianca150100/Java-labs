package serviciu;

import java.util.ArrayList;
import java.util.Iterator;
import model.*;

public class ServiciuLogistica {
    private int index;
    ArrayList<Dotare> produseCabinet = new ArrayList<Dotare>(10);
    ArrayList<Dotare> medicamenteExpirate= new ArrayList<Dotare>(10);
    ArrayList<Dotare> aparateCasate= new ArrayList<Dotare>(10);

    public ServiciuLogistica(int index, ArrayList<Dotare> produseCabinet) {
        this.index = index;
        this.produseCabinet = produseCabinet;
    }

    public ServiciuLogistica() {
        this.index=0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayList<Dotare> getProduseCabinet() {
        return produseCabinet;
    }

    public void setProduseCabinet(ArrayList<Dotare> produseCabinet) {
        this.produseCabinet = produseCabinet;
    }

    public ArrayList<Dotare> getMedicamenteExpirate() {
        return medicamenteExpirate;
    }

    public void setMedicamenteExpirate(ArrayList<Dotare> medicamenteExpirate) {
        this.medicamenteExpirate = medicamenteExpirate;
    }

    public ArrayList<Dotare> getAparate_casate() {
        return aparateCasate;
    }

    public void setAparateCasate(ArrayList<Dotare> aparate_casate) {
        this.aparateCasate = aparate_casate;
    }

    public void adaugaProdus(Dotare d)
    {
        this.produseCabinet.add(d);
        this.index ++;

    }

    public void stergeProdus(Dotare d)
    {
        this.produseCabinet.remove(d);
        this.index--;
    }

    public void caseaza_produse()
    {

        for (int i=0;i< this.produseCabinet.size(); i++)
        {
            Dotare dot = this.produseCabinet.get(i);
            if (dot instanceof Medicament)
            {
                System.out.println("si aici");
                if (dot.verificaValabilitate())
                {
                    System.out.println("a intrat");
                    medicamenteExpirate.add(dot);

                }}
            if (dot instanceof UstensileAparatura)
                if(dot.verificaValabilitate())
                {
                    // System.out.println("aici");

                    aparateCasate.add(dot);

                }
        }
        Iterator <Dotare> itr= this.produseCabinet.iterator();
        while (itr.hasNext())
        {   Dotare dot = itr.next();
            if(dot.verificaValabilitate())
                itr.remove();}

    }

    @Override
    public String toString() {
        return "Evidenta: "
                + produseCabinet +
                ", medicamente_expirate: " + medicamenteExpirate +
                ", aparate_casate: " + aparateCasate +
                '}';
    }
}
