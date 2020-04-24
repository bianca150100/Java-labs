package serviciu;

import model.ConcediuMedical;
import model.GestiuneMedici;
import model.Medic;
import model.Programare;

import java.util.Scanner;

public class ServiciuMedic {
    public void serviciuElibereazaReteta(GestiuneMedici g)
    {
        System.out.println("Dati indexul medicului: ");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        int index= Integer.parseInt(str);
        Medic[] medici = g.getMedici();
        ConcediuMedical conc= new ConcediuMedical();
        try{
            medici[index].elibereaza_reteta(conc);}
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Nu exista medicul cu indicele respectiv. \n Dati un indice dintre: 0,1,2 !");
        }
    }

    public void afiseazaProgramariMedic(GestiuneMedici g) {

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
                        + " in data de: " + prog[i].getZiProg() + "-" + prog[i].getLunaProg() + "-"
                        + prog[i].getAnProg() + " ora: " + prog[i].getOraProg());
            }
        } else {
            System.out.println("Medicul nu are nicio programare");

        }
    }
}
