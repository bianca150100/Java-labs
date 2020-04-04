public class Personal {
    private String nume;
    private String prenume;
    private int An_angajare;

    public Personal() {
        this.nume="Andrei";
        this.prenume="Antonip";
        this.An_angajare=2009;
    }

    public Personal(String nume, String prenume, int an_angajare) {
        this.nume = nume;
        this.prenume = prenume;
        An_angajare = an_angajare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getAn_angajare() {
        return An_angajare;
    }

    public void setAn_angajare(int an_angajare) {
        An_angajare = an_angajare;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", An_angajare=" + An_angajare +
                '}';
    }
}
