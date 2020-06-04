package Forms;

import java.util.Objects;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle(){
        super();
        height=0;
        base=0;
    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return base*height /2;
    }

    @Override
    public String toString() {
        return "Triunghiu: " + super.toString()+  " "+ getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Float.compare(triangle.height, height) == 0 &&
                Float.compare(triangle.base, base) == 0;
    }

    public void print_dim_tr()
    {
        System.out.println("Baza: " + this.base);
        System.out.println("Inaltimea:"+ this.height);
    }

}
