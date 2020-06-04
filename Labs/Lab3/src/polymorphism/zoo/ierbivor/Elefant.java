package polymorphism.zoo.ierbivor;


public class Elefant extends Ierbivor {

    public Elefant(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "ihi";
    }

    public void scoateSunet() {
        System.out.println("elefant " + this.sunetSpecific);
    }
}