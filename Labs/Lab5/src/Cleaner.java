public class Cleaner {

    public static void cleanObject(Object object)
    {
        if (object instanceof Car)
        {
            Car car =(Car) object;
            car.wash();
        }
        if (object instanceof Window)
        {
            Window wind = (Window) object;
            wind.wash();
        }
        if (object instanceof Dog)
        {
            Dog d= (Dog) object;
            d.wash();
        }
        if (object instanceof Cup)
        {
            Cup c = (Cup) object;
            c.wash();
        }
    }

    public static void Clean(WashableObject o)
    {
        o.wash();
    }

    public static void main(String [] args)
    {
        Dog dog = new Dog();
        cleanObject(dog);
     //   Clean(dog);

        Window win=new Window();
        cleanObject(win);
   //     Clean(win);

        Car car= new Car();
        cleanObject(car);
     //   Clean(car);

        Cup cup= new CoffeCup();
        cleanObject(cup);
     //   Clean(cup);
    }
}
