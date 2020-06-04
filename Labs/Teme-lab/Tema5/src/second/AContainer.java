package second;
import first.Task;
import java.util.ArrayList;

public abstract class AContainer implements Container {
    private ArrayList<Task> container;

    public AContainer() {
        this.container = new ArrayList<Task>(10);
    }

    public ArrayList<Task> getContainer() {
        return container;
    }

    public void push(Task t)
    {
        this.container.add(t);
    }

    public int size()
    {
        return this.container.size();
    }

    public boolean isEmpty()
    {
        return (this.size()==0);
    }

}
