package threads;

public class Ex5 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        Thread t5 = new Thread(() -> System.out.println(" 5 " + Thread.currentThread().getName()), "t5");
        t5.start();
        t5.setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
    }
}