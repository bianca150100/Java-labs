import java.util.Scanner;

public class Test_logistica {

    public static void main(String[] args) {

        Logistica log = new Logistica();
      /*  Medicament m1 = new Medicament("Xanax",10, "Farm", 10, 1, 2020, 30, 2, 1);
        Medicament m2 = new Medicament("Parac",20, "Farm", 25, 3, 2020, 30, 2, 1);
       Ustensile_Aparatura u1= new Ustensile_Aparatura("Foarfeca", 10, "Alis",false, "liber","spintecare",5,2018);
        Ustensile_Aparatura u2= new Ustensile_Aparatura("Cutit", 7, "Alis",false, "liber","spintecare",2,2016);
        log.adauga_produs(m1);
       log.adauga_produs(u2);
        log.adauga_produs(m2);
        log.adauga_produs(u1);
        System.out.println("Logistica inainte de casare: ");
        System.out.println(log);
        log.caseaza_produse();
        System.out.println("\n");
        System.out.println("Aparate casate: ");
        System.out.println(log.getAparate_casate());
        System.out.println("\n");
        System.out.println("Medicamente expirate: ");
        System.out.println(log.getMedicamente_expirate());
        System.out.println("\n");
        System.out.println("Logistica dupa casare: ");
        System.out.println(log.getProduse_cabinet());
        */
        System.out.println("Dati numarul de produse pe care vreti sa le adaugati in dotarea cabientului: ");
        Scanner scanner= new Scanner(System.in);
        String str=scanner.nextLine();
        int n=Integer.parseInt(str);
        for(int i=0;i<n;i++) {
            adauga_produse(log);
            System.out.println(log.getProduse_cabinet());
        }
        System.out.println("Doriti sa aplicam procesul de casare? ");
        str=scanner.nextLine();
        int ok=Integer.parseInt(str);
        if( ok ==1)
        {
            log.caseaza_produse();
            System.out.println("Aparate casate: ");
            System.out.println(log.getAparate_casate());
            System.out.println("\n");
            System.out.println("Medicamente expirate: ");
            System.out.println(log.getMedicamente_expirate());
            System.out.println("\n");
            System.out.println("Logistica dupa casare: ");
            System.out.println(log.getProduse_cabinet());;
        }

    }

    public static void adauga_produse(Logistica log)
    {

        System.out.println("Dati 1 daca doriti sa adaugati un medicament, 2 pentru o ustensila");
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        int i = Integer.parseInt(str);
        if (i!=1 && i!=2)
        {
            System.out.println("Introduceti 1 sau 2");
        }
        else
        {
            if (i == 1)
            {

                System.out.println("Dati denumirea: ");
                String denumire = scanner.nextLine();
                System.out.println("Numarul de cutii: ");
                str = scanner.nextLine();
                int nr_cutii =Integer.parseInt(str);
                System.out.println("Distribuitor: ");
                String distribuitor= scanner.nextLine();
                System.out.println("Expira in ziua de: ");
                str= scanner.nextLine();
                int zi_exp=Integer.parseInt(str);
                System.out.println("Luna: ");
                str= scanner.nextLine();
                int luna_exp=Integer.parseInt(str);
                System.out.println("An: ");
                str= scanner.nextLine();
                int an_exp=Integer.parseInt(str);
                System.out.println("Numarul de pastile/cutie: ");
                str=scanner.nextLine();
                int nr_pastile=Integer.parseInt(str);
                System.out.println("Doza recomandata pe zi: ");
                str=scanner.nextLine();
                int doza=Integer.parseInt(str);
                System.out.println("Concentratie: ");
                str=scanner.nextLine();
                float dozaj=Float.parseFloat(str);
                Medicament m1 = new Medicament(denumire,nr_cutii,distribuitor,zi_exp,luna_exp,an_exp,nr_pastile,doza,dozaj);
                log.adauga_produs(m1);

            }
            if (i==2)
            {
                System.out.println("Dati denumirea: ");
                String denumire = scanner.nextLine();
                System.out.println("Numarul de produse: ");
                str = scanner.nextLine();
                int nr_cutii =Integer.parseInt(str);
                System.out.println("Distribuitor: ");
                String distribuitor= scanner.nextLine();
                System.out.println("1-este de unica folosinta \n0-altfel");
                str = scanner.nextLine();
                boolean unic=Boolean.parseBoolean(str);
                System.out.println("Cum se utilizeaza? ");
                String utilizare=scanner.nextLine();
                System.out.println("Este folosit pentru: ");
                String intreb = scanner.nextLine();
                System.out.println("");
                System.out.println("Numarul maxim de ani de utilizare: ");
                str=scanner.nextLine();
                int nr_ani=Integer.parseInt(str);
                System.out.println("Anul aducerii in cabinet: ");
                str=scanner.nextLine();
                int an=Integer.parseInt(str);
                Ustensile_Aparatura u1= new Ustensile_Aparatura(denumire,nr_cutii,distribuitor,unic,utilizare,intreb,nr_ani,an);
                log.adauga_produs(u1);
            }
        }
    }


}
