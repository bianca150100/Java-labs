import model.*;
import serviciu.*;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ServiciuAudit serviciu = ServiciuAudit.getInstance();
        serviciu.deschideFis("ServiciuAudit.csv");
        ServiciuProgramari t = new ServiciuProgramari();
        ServiciuMedic m=new ServiciuMedic();
        GestiuneMedici g = new GestiuneMedici();
        while (true) {

            System.out.println("ALEGETI OPTIUNEA: ");
            System.out.println("0. Finalizare servicii");
            System.out.println("1. Adauga programari: ");
            System.out.println("2. Modifica o programare existenta: ");
            System.out.println("3. Afiseaza programarile unui anumit medic: ");
            System.out.println("4. Afiseaza programarile dintr-o anumita zi din cabinet");
            System.out.println("5. Anuleaza programarea: ");
            System.out.println("6. Elibereaza reteta: ");
            Scanner scanner = new Scanner(System.in);
            int opt = scanner.nextInt();
            if (opt == 0) {
                break;
            }
            switch (opt) {
                case 1:
                    Programare p = null;
                    t.serviciuAdaugaProg(g, p, 0,  1);
                    serviciu.adaugaServiciu("adauga programare");
                    break;

                case 2:
                    t.serviciuModificaProg(g,0,1,0,0,0,1);
                    serviciu.adaugaServiciu("modifica programare");
                    break;

                case 3:
                    m.afiseazaProgramariMedic(g);
                    serviciu.adaugaServiciu("afiseaza programari medic");
                    break;

                case 4:
                    t.afiseazaProgramariZiCabinet(g);
                    serviciu.adaugaServiciu("afiseaza programari cabinet /zi");
                    break;

                case 5:
                    t.servicuAnuleazaProg(g, 0, 1);
                    serviciu.adaugaServiciu("anuleaza programare");
                    break;

                case 6:
                    m.serviciuElibereazaReteta(g);
                    serviciu.adaugaServiciu("elibereaza reteta");

            }
            System.out.println("\n \n");
        }
    }
}
