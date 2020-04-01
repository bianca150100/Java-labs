package first;

public class CounterOutTask implements Task {
    private static int cont = 0;

    @Override
    public void execute() {
        cont++;
        System.out.println("Contorul are valoarea: " + cont);
    }
}
