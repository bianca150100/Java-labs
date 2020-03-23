package polymorphism.zoo.ierbivor;


public class Cal extends Ierbivor {

    public Cal(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "call";
    }

    public void scoateSunet() {
        System.out.println("cal " + this.sunetSpecific);
    }
}