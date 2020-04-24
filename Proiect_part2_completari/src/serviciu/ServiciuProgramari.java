package serviciu;
import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiciuProgramari {

    public void serviciuAdaugaProg(GestiuneMedici g)
    {

        Secretariat secretar = new Secretariat("Toderoiu","Anca",10, g);
        System.out.println(secretar);
        secretar.creeazaProgramare();
        //  System.out.println(secretar.getGestiune());
        //return g;
    }

    public void serviciuModificaProg(GestiuneMedici g)
    {
        Secretariat secretar = new Secretariat("Toderoiu","Anca",10, g);
        secretar.modificaProgramare();

    }

    public void servicuAnuleazaProg(GestiuneMedici g)
    {
        Secretariat secretar = new Secretariat("Toderoiu","Anca",10, g);
        secretar.anuleazaProgramare();
    }


    public void afiseazaProgramariZiCabinet (GestiuneMedici g)
    {

        System.out.println("Ziua pentru care doriti afisarea tuturor programarilor: ");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        int ziua_dorita= Integer.parseInt(str);
        System.out.println("Luna: ");
        str=scanner.nextLine();
        int luna_dorita = Integer.parseInt(str);
        Medic [] medici = g.getMedici();
        int nr_medici= g.getNrMedici();
        ArrayList<Programare> prog_dorite = new ArrayList<Programare>();
        for(int i=0;i<nr_medici;i++)
        {
            Programare[] prog_medic = medici[i].getProgramari();
            int nr_prog_medic= medici[i].getSize();
            for(int j=0; j<nr_prog_medic ; j++)
            {
                if (prog_medic[j].getZiProg() == ziua_dorita && prog_medic[j].getLunaProg() == luna_dorita)
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
            System.out.println(k + ". " + p.getPacient().get_nume() + " " + p.getPacient().get_prenume() + " , ora: " + p.getOraProg());
        }
    }



}
