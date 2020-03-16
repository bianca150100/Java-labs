package polymorphism.zoo;

import polymorphism.zoo.carnivor.Leu;
import polymorphism.zoo.carnivor.Pisica;
import polymorphism.zoo.ierbivor.Cal;
import polymorphism.zoo.ierbivor.Elefant;
import polymorphism.zoo.omnivor.Caine;
import polymorphism.zoo.omnivor.Urs;

import java.util.Scanner;


public class ZooTest {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Precizati nr max de animale ce pot fi gazduite la zoo: ");
        int nrAnimaleZoo = scanner.nextInt();
        scanner.close();

        Zoo zooBucuresti = new Zoo(nrAnimaleZoo);
        adaugaAnimaleLaZoo(zooBucuresti);
        for (int i = 0; (i < zooBucuresti.animaleZoo.length) && (zooBucuresti.animaleZoo[i] != null); i++) {
            Animal animal = zooBucuresti.animaleZoo[i];
            animal.afiseazaDetalii();
            animal.seHraneste();
            animal.scoateSunet();
        }

    }

    public static void adaugaAnimaleLaZoo(Zoo zoo) {
        Leu leu = new Leu("Mitu", 3);
        zoo.adaugaAnimal(leu);
        Elefant elefant = new Elefant("Elo", 10);
        zoo.adaugaAnimal(elefant);
        Urs urs = new Urs("Fram", 4);
        zoo.adaugaAnimal(urs);
        Pisica pisica = new Pisica("Kity", 1);
        zoo.adaugaAnimal(pisica);
        Caine caine = new Caine("Negrutu", 2);
        zoo.adaugaAnimal(caine);
        Cal cal = new Cal("Stela", 5);
        zoo.adaugaAnimal(cal);
    }

}