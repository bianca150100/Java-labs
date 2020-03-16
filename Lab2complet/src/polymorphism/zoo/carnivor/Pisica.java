package polymorphism.zoo.carnivor;

public class Pisica extends Carnivor {

    public Pisica(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "miauna";
    }


    public void scoateSunet() {
        System.out.println("pisica " + this.sunetSpecific);
    }


    public String toString() {
        return super.toString() + " Pisica{" +
                "sunetSpecific='" + sunetSpecific + '\'' +
                '}';
    }


    public boolean equals(Object obj) {
        if (obj instanceof Pisica){
            Pisica pisica = (Pisica) obj;
            return pisica.getNume().equals(this.getNume());
        }
        return false;
    }
}