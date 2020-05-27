package builder;

public class BankAcc {
    private String accountNo;
    private String name;
    private String email;
    private boolean acceptNewsletter;

    public BankAcc(BankAccBuilder bankAccountBuilder) {
        this.accountNo = bankAccountBuilder.accountNo;
        this.name = bankAccountBuilder.name;
        this.email = bankAccountBuilder.email;
        this.acceptNewsletter = bankAccountBuilder.acceptNewsletter;
    }

    public static class BankAccBuilder {
        private String accountNo;
        private String name;
        private String email;
        private boolean acceptNewsletter;

        public BankAccBuilder withAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }

        public BankAccBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BankAccBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccBuilder acceptNewsLetter(boolean acceptNewsletter) {
            this.acceptNewsletter = acceptNewsletter;
            return this;
        }

        public BankAcc build() {
            return new BankAcc(this);
        }
    }

}