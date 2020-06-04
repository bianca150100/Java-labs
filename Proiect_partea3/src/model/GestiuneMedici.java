package model;

import java.util.Arrays;

public class GestiuneMedici {
    private Medic [] medici;
    protected int nrMedici;

    public Medic[] getMedici() {
        return medici;
    }

    public void setMedici(Medic[] medici) {
        this.medici = medici;
    }

    public int getNrMedici() {
        return nrMedici;
    }

    public void setNrMedici(int nrMedici) {
        this.nrMedici = nrMedici;
    }

    public GestiuneMedici() {
        this.medici = new Medic[3];
        this.medici[0]=new Medic("Ionescu","Radu", 2010, 4000, 200, "Radiologie", 5, 4 );
        this.medici[1]=new Medic("Avram","Radu", 2010, 4000, 200, "Radiologie", 5 , 4);
        this.medici[2]=new Medic("Cojocaru","Antonia", 2010, 4000, 200, "Radiologie", 5 , 4);
        this.nrMedici=3;

    }

    public void actualizeazaMedic(int index, Medic medic)
    {
        medici[index]=medic;
    }


    @Override
    public String toString() {
        return "Gestiune_medici{" +
                "medici=" + Arrays.toString(medici) +
                ", nr_medici=" + nrMedici +
                '}';
    }
}
