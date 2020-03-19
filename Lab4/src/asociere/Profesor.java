package asociere;

public class Profesor {

    private int id;
    private String nume;

    public Profesor(int id, String nume) {
        this.nume = nume;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }
}
