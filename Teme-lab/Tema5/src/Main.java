import first.*;
import second.*;

public class Main {

    public static void main(String[] args) {
        int nr = 6;
        Task[] tasks;
        tasks = new Task[nr];

        tasks[0] = new OutTask("Buna");
        tasks[1] = new RandomOutTask();
        tasks[2] = new CounterOutTask();
        tasks[3] = new OutTask("Ce faci?");
        tasks[4] = new CounterOutTask();
        tasks[5] = new RandomOutTask();

        for (Task task : tasks) {
            task.execute();
        }

        System.out.println("\nStack: ");
        Stack s = new Stack();
        s.push(tasks[0]);
        s.push(tasks[1]);
        s.push(tasks[2]);
        s.push(tasks[3]);
        s.push(tasks[4]);
        s.push(tasks[5]);
        while (!s.isEmpty()) {
            s.pop().execute();
        }

        System.out.println("\nQueue: ");
        Queue q= new Queue();
        q.push(tasks[0]);
        q.push(tasks[1]);
        q.push(tasks[2]);
        q.push(tasks[3]);
        q.push(tasks[4]);
        q.push(tasks[5]);
        while (!q.isEmpty()) {
            q.pop().execute();
        }

    }
}

