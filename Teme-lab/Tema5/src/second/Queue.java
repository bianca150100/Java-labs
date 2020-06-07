package second;

import first.Task;

public class Queue extends AContainer {
    public Queue() {
        super();
    }

    public Task pop()
    {
        if (getContainer().isEmpty())
            return null;
        else
        { Task t = getContainer().remove(0);
        return t;}

    }
}
