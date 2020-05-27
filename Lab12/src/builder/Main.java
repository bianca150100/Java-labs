package builder;

public class Main {
    public static void main(String[] args) {
        BankAcc bankAccount = new BankAcc.BankAccBuilder()
                .withAccountNo("111111")
                .withName("Andrei")
                .withEmail("a@a.a")
                .acceptNewsLetter(true)
                .build();
        System.out.println(bankAccount);
    }

}