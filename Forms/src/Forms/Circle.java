package Forms;

public class Circle extends Form {
    private float radius;

    public Circle(){
        super();
        radius=0;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        float pi=3.14f;
        return pi*radius*radius;
    }

    @Override
    public String toString() {
        return "Cerc: " + super.toString() +" " + getArea();
    }

    public void print_dim_cerc()
    {
        System.out.println("Raza: " + this.radius);
    }
}
