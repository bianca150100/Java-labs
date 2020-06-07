package second;

import first.Task;

public class Stack extends AContainer {
    public Stack() {
        super();
    }

    public Task pop()
    {
        if (getContainer().isEmpty())
            return null;
        else
        {
            Task t= getContainer().remove(getContainer().size()-1);
            return  t;
        }
    }


}
