public class Test_reteta {
    public static void main(String[] args) {

        Pacient p = new Pacient(1, "Tudor", "Andrei", 43, 1998, 5, 3,new Programare());
        Reteta r = new Reteta(p, 3, "Raceala acuta", 30, true);
        System.out.println(r);

    }
}
