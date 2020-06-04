package model;
import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class Secretariat extends Personal {
    GestiuneMedici gestiune;

    public Secretariat(String nume, String prenume, int an, GestiuneMedici gestiune) {
        super(nume,prenume,an);
        this.gestiune = gestiune;
    }

    public Secretariat() {
    }

    public GestiuneMedici getGestiune() {
        return gestiune;
    }

    public void setGestiune(GestiuneMedici gestiune) {
        this.gestiune = gestiune;
    }

    public String genereazaListaMedici() {
        String result="";
        int n = gestiune.getNrMedici();
        Medic[] medici = new Medic[n];
        medici = gestiune.getMedici();
        String sir;
        for (int i = 0; i < n; i++)
        { //System.out.println(i + ".DR.  " + medici[i].getNume() + " " + medici[i].getPrenume());
            sir = i + ".DR.  " + medici[i].getNume() + " " + medici[i].getPrenume();
            sir += "       ";
            result += sir;}
        return result;
    }

    public Programare creeazaProgramare(Programare prog, int indice, int sursa) {
        if (sursa == 1) {
            Programare i = new Programare();
            System.out.println("Doriti o noua programare? ");
            Scanner scanner = new Scanner(System.in);
            String confirmare;
            confirmare = scanner.nextLine();
            try {
                int ok = Integer.parseInt(confirmare);
                if (ok != 1) {
                    System.out.println("1-pentru confirmare");
                }
                if (ok == 1) {
                    Pacient p = new Pacient();
                    System.out.println("Dati informatiile dumneavoastra:  ");
                    System.out.println("Numele dumneavostra este: ");
                    p.setNrIdentificare(hashCode());
                    String str = scanner.nextLine();
                    p.setNume(str);
                    System.out.println("Prenumele este: ");
                    str = scanner.nextLine();
                    p.setPrenume(str);
                    System.out.println("Aveti varsta de:    ani");
                    str = scanner.nextLine();
                    int vr = Integer.parseInt(str);
                    p.setVarsta(vr);
                    System.out.println("Ziua nasterii: ");
                    str = scanner.nextLine();
                    int zi = Integer.parseInt(str);
                    p.setZi_nastere(zi);
                    System.out.println("Luna nasterii: ");
                    str = scanner.nextLine();
                    int luna = Integer.parseInt(str);
                    p.setLuna_nastere(luna);
                    System.out.println("Anul nasterii: ");
                    str = scanner.nextLine();
                    int ann = Integer.parseInt(str);
                    p.setAn_nastere(ann);
                    System.out.println("Alegeti medicul dorit: ");
                    this.genereazaListaMedici();
                    str = scanner.nextLine();
                    int indice_medic = Integer.parseInt(str);
                    Medic[] medici = gestiune.getMedici();

                    System.out.println("Dati ziua prog: ");
                    str = scanner.nextLine();
                    int ziua = Integer.parseInt(str);
                    System.out.println("Dati luna prog: ");
                    str = scanner.nextLine();
                    int lun = Integer.parseInt(str);
                    System.out.println("Dati anul prog: ");
                    str = scanner.nextLine();
                    int an = Integer.parseInt(str);
                    System.out.println("Ora dorita: ");
                    str = scanner.nextLine();
                    int ora = Integer.parseInt(str);
                    if (medici[indice_medic].verifica_disponibilitate_medic(ziua, lun, an, ora)) {
                        Programare pp = new Programare(ziua, lun, an, ora, p, medici[indice_medic]);
                        medici[indice_medic].adaugaProgramareMedic(pp);
                        Arrays.sort(medici[indice_medic].getProgramari(), 0, medici[indice_medic].getSize());
                        p.setProgramare(pp);
                        System.out.println("Programarea d-voastra:  ");
                        System.out.println(pp);

                        return pp;
                    } else {
                        System.out.println("Ne pare rau, data dorita nu e disponibila");
                    }

                }
            } catch (NumberFormatException e) {
                System.out.println("Introduceti 1-confirmare");
            }
            return i;
        } else {
            Medic[] medici = gestiune.getMedici();
            Medic medic = prog.getMedic();

            int indice_medic = indice;

            int ziua = prog.getZiProg();
            int an = prog.getAnProg();
            int lun = prog.getLunaProg();
            int ora = prog.getOraProg();
            Pacient p = prog.getPacient();
            if (medici[indice_medic].verifica_disponibilitate_medic(ziua, lun, an, ora)) {

                medici[indice_medic].adaugaProgramareMedic(prog);
                Arrays.sort(medici[indice_medic].getProgramari(), 0, medici[indice_medic].getSize());
                p.setProgramare(prog);
                System.out.println("Programarea d-voastra:  ");
                System.out.println(prog);

                return prog;

            }
            else {
                System.out.println("Ne pare rau, data dorita nu e disponibila");

            }
        }
        return null;
    }
    public String anuleazaProgramare( int nr_inreg,  int sursa)
    {
        String strrr = "";
        if (sursa == 1)
        {
        Programare pr = new Programare();
        System.out.println("Doriti sa anulati o programare? ");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int ok = Integer.parseInt(str1);
        if (ok!=1)
        {
            System.out.println("1-pentru confirmare");
        }
        if (ok==1)
        {
            Pacient p=new Pacient();
            System.out.println("Dati numarul de inregistrare al programarii dumneavoastra:  ");
            String str = scanner.nextLine();
            int index_progrm=Integer.parseInt(str);
            System.out.println("Alegeti medicul la care aveti programarea: ");
            this.genereazaListaMedici();
            str = scanner.nextLine();
            int indice_medic = Integer.parseInt(str);
            Medic[] medici = gestiune.getMedici();
            int nr_medici=gestiune.getNrMedici();
            int ok2=0;
            for(int i=0;i<nr_medici;i++)
            {
                Programare[] prog = medici[i].getProgramari();
                int nr_prog= medici[i].getSize();
                for(int j=0;j<nr_prog;j++)
                {
                    if (prog[j].getNumarProg() == index_progrm)
                    {   ok2=1;
                        System.out.println("Numele dumeavoastra: " + prog[j].getPacient().get_nume());
                        medici[i].stergereProgramareMedic(j);
                    }
                }

            }
            if (ok2==0)
            {
                System.out.println("Datele nu corespund niciunei programari! ");
            }

        }}
        else {
            Medic[] medici = gestiune.getMedici();
            int nr_medici = gestiune.getNrMedici();
            int ok2 = 0;
            for (int i = 0; i < nr_medici; i++) {
                Programare[] prog = medici[i].getProgramari();
                int nr_prog = medici[i].getSize();
                for (int j = 0; j < nr_prog; j++) {
                    if (prog[j].getNumarProg() == nr_inreg) {
                        ok2 = 1;
                        System.out.println("Numele dumeavoastra: " + prog[j].getPacient().get_nume());
                        strrr +=  prog[j].getPacient().get_nume();

                        medici[i].stergereProgramareMedic(j);
                    }
                }
            }
        }
        return strrr;
    }

    public String modificaProgramare(int nr_inreg, int indice_medicc, int zi, int luna, int ora, int sursa) {
        String result = "";
        if (sursa == 1) {
            Programare pr = new Programare();
            System.out.println("Doriti sa modificati o programare? ");
            Scanner scanner = new Scanner(System.in);
            String str1 = scanner.nextLine();
            int ok = Integer.parseInt(str1);
            if (ok != 1) {
                System.out.println("1-pentru confirmare");
            }
            if (ok == 1) {
                Pacient p = new Pacient();
                System.out.println("Dati numarul de inregistrare al programarii dumneavoastra:  ");
                String str = scanner.nextLine();
                int index_progrm = Integer.parseInt(str);
                System.out.println("Alegeti medicul la care aveti programarea: ");
                this.genereazaListaMedici();
                str = scanner.nextLine();
                int indice_medic = Integer.parseInt(str);
                Medic[] medici = gestiune.getMedici();
                int nr_medici = gestiune.getNrMedici();
                try {
                    Programare[] prog = medici[indice_medic].getProgramari();


                    int nr_prog = medici[indice_medic].getSize();
                    System.out.println("indice medic: " + indice_medic);
                    for (int j = 0; j < nr_prog; j++) {
                        if (prog[j].getNumarProg() == index_progrm) {
                            System.out.println("Modficam programare pentru: ");
                            System.out.println("Ziua: ");
                            str = scanner.nextLine();
                            int zi_noua = Integer.parseInt(str);
                            System.out.println("Luna: ");
                            str = scanner.nextLine();
                            int luna_noua = Integer.parseInt(str);
                            System.out.println("Ora: ");
                            str = scanner.nextLine();
                            int ora_noua = Integer.parseInt(str);
                            if (medici[indice_medic].verifica_disponibilitate_medic(zi_noua, luna_noua, prog[j].getAnProg(), ora_noua)) {
                                prog[j].setLunaProg(luna_noua);
                                prog[j].setOraProg(ora_noua);
                                prog[j].setZiProg(zi_noua);
                                System.out.println("Numele dumeav: " + prog[j].getPacient().get_nume());
                                medici[indice_medic].setProgramari(prog);
                                Arrays.sort(medici[indice_medic].getProgramari(), 0, medici[indice_medic].getSize());
                                Pacient p_schimb = prog[j].getPacient();
                                p_schimb.setProgramare(prog[j]);
                            } else {
                                System.out.println("Ne pare rau, data dorita nu e disponibila!");
                            }
                            break;

                        }
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Nu exista medicul! \n Dati un indice 0,1,2!");
                }
            }

        } else {

            Medic[] medici = gestiune.getMedici();
            int nr_medici = gestiune.getNrMedici();
            Programare[] prog = medici[indice_medicc].getProgramari();


            int nr_prog = medici[indice_medicc].getSize();

            for (int j = 0; j < nr_prog; j++) {
                if (prog[j].getNumarProg() == nr_inreg) {
                    if (medici[indice_medicc].verifica_disponibilitate_medic(zi, luna, prog[j].getAnProg(), ora)) {
                        prog[j].setLunaProg(luna);
                        prog[j].setOraProg(ora);
                        prog[j].setZiProg(zi);
                        System.out.println("Numele dumeav: " + prog[j].getPacient().get_nume());
                        medici[indice_medicc].setProgramari(prog);
                        Arrays.sort(medici[indice_medicc].getProgramari(), 0, medici[indice_medicc].getSize());
                        Pacient p_schimb = prog[j].getPacient();
                        p_schimb.setProgramare(prog[j]);
                    } else {
                        result = "Ne pare rau, data dorita nu e disponibila!";
                    }
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Secretariat{" +
                " gestiune=" + gestiune +
                '}';
    }
}