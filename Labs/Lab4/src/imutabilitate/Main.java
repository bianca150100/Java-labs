package imutabilitate;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Adresa domiciuliu = new Adresa("Timis","4");

        Persoana persoana= new Persoana(1,"Pavel", domiciuliu);
        String numePers= persoana.getNume().toUpperCase();
        System.out.println(persoana);
        System.out.println(numePers);

        String stradaUpper= domiciuliu.getStrada().toUpperCase();
        domiciuliu.setStrada(stradaUpper);

        System.out.println(persoana);

        Adresa a= persoana.getAdresa();

        a.setStrada(a.getStrada().toUpperCase());
        System.out.println(persoana);

    }
}
