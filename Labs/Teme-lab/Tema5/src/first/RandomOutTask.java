package first;

import java.util.Random;

public class RandomOutTask implements Task {
    private int numar;

    public RandomOutTask() {
        Random r = new Random();
        numar = r.nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println("Numarul este: " + this.numar);
    }
}
