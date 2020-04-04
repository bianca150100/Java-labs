import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test_medici {

    public void serviciu_adauga_prog(Gestiune_medici g)
    {

        Secretariat secretar = new Secretariat("Toderoiu","Anca",10, g);
        System.out.println(secretar);
        secretar.creeaza_programare();
      //  System.out.println(secretar.getGestiune());
        //return g;
    }

    public void serviciu_modifica_prog(Gestiune_medici g)
    {
        Secretariat secretar = new Secretariat("Toderoiu","Anca",10, g);
        secretar.modifica_programare();

    }

    public void servicu_anuleaza_prog(Gestiune_medici g)
    {
        Secretariat secretar = new Secretariat("Toderoiu","Anca",10, g);
        secretar.anuleaza_programare();
    }

    public void serviciu_elibereaza_reteta(Gestiune_medici g)
    {
        System.out.println("Dati indexul medicului: ");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        int index= Integer.parseInt(str);
        Medic [] medici = g.getMedici();
        Concediu_medical conc= new Concediu_medical();
        try{
        medici[index].elibereaza_reteta(conc);}
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Nu exista medicul cu indicele respectiv. \n Dati un indice dintre: 0,1,2 !");
        }
    }

    public void afiseaza_programari_medic(Gestiune_medici g) {

        System.out.println("Dati indexul medicului: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = Integer.parseInt(str);
        Medic m = g.getMedici()[index];
        Programare[] prog = m.getProgramari();
        System.out.println("Medicul: " + m.getNume() + " " + m.getPrenume());
        if (m.getSize() != 0) {
            for (int i = 0; i < m.getSize(); i++) {
                int k = i + 1;
                System.out.println(k + ". " + prog[i].getPacient().get_nume() + " " + prog[i].getPacient().get_prenume()
                        + " in data de: " + prog[i].getZi_prog() + "-" + prog[i].getLuna_prog() + "-"
                        + prog[i].getAn_prog() + " ora: " + prog[i].getOra_prog());
            }
        } else {
            System.out.println("Medicul nu are nicio programare");

        }
    }


    public void afiseaza_programari_zi_cabinet (Gestiune_medici g)
    {

        System.out.println("Ziua pentru care doriti afisarea tuturor programarilor: ");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        int ziua_dorita= Integer.parseInt(str);
        System.out.println("Luna: ");
        str=scanner.nextLine();
        int luna_dorita = Integer.parseInt(str);
        Medic [] medici = g.getMedici();
        int nr_medici= g.getNr_medici();
        ArrayList<Programare> prog_dorite = new ArrayList<Programare>();
        for(int i=0;i<nr_medici;i++)
        {
            Programare[] prog_medic = medici[i].getProgramari();
            int nr_prog_medic= medici[i].getSize();
            for(int j=0; j<nr_prog_medic ; j++)
            {
                if (prog_medic[j].getZi_prog() == ziua_dorita && prog_medic[j].getLuna_prog() == luna_dorita)
                {
                    //System.out.println("Adaug prog cu numee: " + prog_medic[j].getPacient().get_nume());
                    prog_dorite.add(prog_medic[j]);}

            }
        }
        if (prog_dorite.size() == 0)
        {
            System.out.println( "Nu avem nicio programare in aceasta zi! ");
        }
        Collections.sort(prog_dorite);
        for( int i=0;i<prog_dorite.size();i++)
        {
            Programare p = prog_dorite.get(i);
            int k=i+1;
            System.out.println(k + ". " + p.getPacient().get_nume() + " " + p.getPacient().get_prenume() + " , ora: " + p.getOra_prog());
        }
    }



}
