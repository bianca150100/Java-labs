import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Test_medici t = new Test_medici();
        Gestiune_medici g = new Gestiune_medici();
        while (true) {

            System.out.println("ALEGETI OBTIUNEA: ");
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
                    t.serviciu_adauga_prog(g);
                    break;

                case 2:
                    t.serviciu_modifica_prog(g);
                    break;

                case 3:
                    t.afiseaza_programari_medic(g);
                    break;

                case 4:
                    t.afiseaza_programari_zi_cabinet(g);
                    break;

                case 5:
                    t.servicu_anuleaza_prog(g);
                    break;

                case 6:
                    t.serviciu_elibereaza_reteta(g);

            }
            System.out.println("\n \n");
        }
    }
}
