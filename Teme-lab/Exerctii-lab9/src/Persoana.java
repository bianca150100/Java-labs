import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Persoana {

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    static void afiseaza (List<Persoana> p) {
        System.out.println("lista: ");
        p.stream().forEach(System.out::println);
    }

    static void sorteazaPrenume (List<Persoana> p) {
        System.out.println("Sortati prenume ");
        p.stream().sorted(Comparator.comparing(a -> a.prenume))
                .forEach(System.out::println);
    }



    static void sorteazaVarsta (List<Persoana> pers) {
        System.out.println("Sortati varsta: ");
        pers.stream().sorted(Comparator.comparing(a -> a.varsta))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    static void afiseazaTanar (List<Persoana> pers) {
        System.out.println("Cel mai tanar: ");
        System.out.print( pers.stream().min(Comparator.comparing(a -> a.varsta))
                .orElseThrow());



    }

    public static void main(String[] args) {
        List<Persoana> pers = Arrays.asList(
                new Persoana("Popescu", "Ion", 23),
                new Persoana("Toader", "Maria", 19),
                new Persoana("Popescu", "Ioana", 34),
                new Persoana("Mihai", "Gheorghe", 35));
            Persoana.afiseaza(pers);
            Persoana.sorteazaPrenume(pers);
            Persoana.sorteazaVarsta(pers);
            Persoana.afiseazaTanar(pers);

    }
}
