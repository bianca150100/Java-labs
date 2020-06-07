package Forms;

public class Form {
    private String color;

    public float getArea()
    {
        return 0;
    }

    public Form(){
        color="red";
    }

    public Form(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
