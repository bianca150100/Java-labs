package second;
import first.Task;

public interface Container {
        Task pop();
        void push(Task k);
        int size();
        boolean isEmpty();
}
