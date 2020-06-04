package serviciu;

import model.Pacient;
import model.Programare;

import java.util.ArrayList;

public class Servicii {
    ArrayList <Programare> programariCabinet = new ArrayList<>();
    ArrayList <Pacient> pacientiCabinet = new ArrayList<>();

    public Servicii() {
    }

    public ArrayList<Programare> getProgramariCabinet() {
        return programariCabinet;
    }

    public void setProgramariCabinet(ArrayList<Programare> programariCabinet) {
        this.programariCabinet = programariCabinet;
    }

    public ArrayList<Pacient> getPacientiCabinet() {
        return pacientiCabinet;
    }

    public void setPacientiCabinet(ArrayList<Pacient> pacientiCabinet) {
        this.pacientiCabinet = pacientiCabinet;
    }

    public void adaugaPacient(Pacient p)
    {
        pacientiCabinet.add(p);
        System.out.println(pacientiCabinet.size());
    }

    public void adaugaProgramare(Programare p)
    {

    }
}
