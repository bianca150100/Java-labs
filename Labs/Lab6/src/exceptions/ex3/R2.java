package exceptions.ex3;

public class R2 implements AutoCloseable {
    String name;

    public R2(String name) {
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        System.out.println("r2 name: " + name);
        throw new Exception("exception in close");
    }
}
