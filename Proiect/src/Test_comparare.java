import java.util.Arrays;

public class Test_comparare {
    public static void main(String[] args) {
        Pacient p= new Pacient();
        Medic m = new Medic();
        Programare [] prog ={ new Programare(11,10,2020, 10, p, m ),
                new Programare(11,10,2020, 8, p , m),
                new Programare(12, 9, 2020, 9, p, m )};
        System.out.println("Before sorting: " + Arrays.toString(prog));
        Arrays.sort(prog);
        System.out.println("Ascending by year sort: " + Arrays.toString(prog));
    }
}
