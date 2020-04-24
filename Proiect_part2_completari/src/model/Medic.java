package model;

import java.util.Arrays;
import java.util.Scanner;

public class Medic extends Personal {
    private int salariu;
    private int sporuri;
    private String specializare;
    private int experinta;
    private Programare[] programari;
    private int size;
    private int capacity;

    public Medic() {
        super();
        this.capacity=10;
    }

    public Medic(String nume, String prenume, int anAngajare, int salariu, int sporuri, String specializare, int experinta, int capacity) {
        super(nume, prenume, anAngajare);
        this.salariu = salariu;
        this.sporuri = sporuri;
        this.specializare = specializare;
        this.experinta = experinta;
        setCapacity(capacity);
    }


    public void setCapacity(int n) {
        if (n > capacity) {

            if (capacity == 0) {
                programari = new Programare[n];
            } else {
                programari = Arrays.copyOf(programari, n);
            }
            capacity = n;
        }
    }

    public void adaugaProgramareMedic(Programare ap) {
        if (size == capacity)
        {  setCapacity(2 * capacity);}

        programari[size] = ap;
        size++;
        System.out.println(size);
    }

    public void stergereProgramareMedic(int index)
    {
        if (index >= size)
            throw new IndexOutOfBoundsException(index);
        else
        {
            for (int i=index; i<size-1; ++i)
                programari[i] = programari[i+1];
        }
        --size;
    }

    public void setProgramari(Programare[] programari) {
        this.programari = programari;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public int getSporuri() {
        return sporuri;
    }

    public void setSporuri(int sporuri) {
        this.sporuri = sporuri;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public int getExperinta() {
        return experinta;
    }

    public void setExperinta(int experinta) {
        this.experinta = experinta;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Medic{" + super.toString() +
                // ", programari=" + Arrays.toString(programari) +
                ", nr_programari=" + size +
                '}';
    }

    public Pacient returneazaPacient(int index)
    {
        Pacient p =new Pacient();
        try {
            p = this.programari[index].getPacient();
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Nu exista pacientul in lista d-voastra!");
            return null;
        }
        return p;
    }



    public Programare[] getProgramari() {
        return programari;
    }


    /*public void ordoneaza_programari()
    {
        Arrays.sort(this.programari,0,size-1);
        System.out.println(this.programari[size-1]);
    }*/

    public Reteta elibereaza_reteta(ConcediuMedical concediiu) {

        Pacient p = new Pacient();
        System.out.println("Dati indexul pacientului pentru care doriti reteta: ");
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();
        int index = Integer.parseInt(str);
        p = returneazaPacient(index);
        Reteta r = new Reteta();
        if (p != null) {
            System.out.println("Pacientul este: ");
            System.out.println(p);
            int nr_fisa = hashCode();
            System.out.println("Dati diagnosticul: ");
            String diag = scanner.nextLine();
            System.out.println("Dati perioada tratament: ");
            str = scanner.nextLine();
            int perioada = Integer.parseInt(str);
            System.out.println("Necesita concediu medical: ");
            str = scanner.nextLine();
            int concediu = Integer.parseInt(str);
            if (concediu == 0) {
                Reteta reteta = new Reteta(p, nr_fisa, diag, perioada, false);
                return reteta;
            } else {
                Reteta reteta = new Reteta(p, nr_fisa, diag, perioada, true);
                //Concediu_medical concediu= new Concediu_medical();
                concediiu.setP(p);
                concediiu.setZiAcordare(this.programari[index].ziProg);
                concediiu.setLunaAcordare(this.programari[index].lunaProg);
                System.out.println("Oferiti concediu medical pana in ziua de: ");
                str = scanner.nextLine();
                int zi_con = Integer.parseInt(str);
                System.out.println("Luna: ");
                str = scanner.nextLine();
                int luna_con = Integer.parseInt(str);
                concediiu.setLunaIncheiere(luna_con);
                concediiu.setZiIncheiere(zi_con);
                concediiu.setCodDiagnostic(hashCode());
                concediiu.setNrInreg(hashCode());
                System.out.println(concediiu);
                return reteta;
            }

        }
        return r;
    }

    public boolean verifica_disponibilitate_medic(int zi, int luna, int an, int ora)
    {
        for (int i=0;i<this.size;i++)
        {
            if (this.programari[i].getLunaProg() == luna && this.programari[i].getAnProg()==an &&
                    this.programari[i].getOraProg()==ora && this.programari[i].getZiProg() ==zi )
                return false;
        }
        return true;
    }

}