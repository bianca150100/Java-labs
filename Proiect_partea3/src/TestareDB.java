
import database.DatabaseMedicament;
import database.DatabasePacientProgramare;
import database.DatabasePersonal;
import database.DatabasePersonal;
import model.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestareDB {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // testam DB persona;
        Personal p1 = new Personal("Buzoi", "Bianca", 2017);
        Personal p2= new Personal("Sianu", "George", 2019);
        Personal p3= new Personal("Necula", "Alex", 2020);
        DatabasePersonal d = DatabasePersonal.getInstance();
        d.adaugaPersonal(p1,1);
        d.adaugaPersonal(p2,2);
        d.adaugaPersonal(p3,3);
        List<Personal> listaPersonal = d.citestePersonal();
        System.out.println(listaPersonal.size());
        d.updatePersonal("Buzoi",1000);
        d.afiseazaPersonal("Buzoi");
        d.stergePersonal("Buzoi");
        listaPersonal=d.citestePersonal();
        System.out.println(listaPersonal.size());
        d.stergePersonalDb();

        // testam DB pacient + programare
        GestiuneMedici gestiune = new GestiuneMedici();
        Medic[] medici = gestiune.getMedici();
        Pacient p = new Pacient();
        p.setNrIdentificare(10);
        p.setNume("Buzoi");
        p.setPrenume("Bianca");
        p.setVarsta(20);
        p.setZi_nastere(15);
        p.setLuna_nastere(1);
        p.setAn_nastere(2000);
        Programare pp = new Programare(20, 6, 2020, 9, p, medici[1]);
        p.setProgramare(pp);
        DatabasePacientProgramare dp= DatabasePacientProgramare.getInstance();
        dp.adaugaPacient(p,1);
        List<Pacient> listaP = dp.citestePacient();
        System.out.println(listaP.size());
        dp.updatePacient("Buzoi",10);
        dp.afiseazaPacient("Buzoi");
//        dp.stergePacient("Buzoi");
        dp.citesteProgramare();

        dp.citesteProgramare();
        dp.stergePacient("Buzoi");
        dp.citesteProgramare();
        dp.stergePacientDb();
        List<Pacient> listaP2 = dp.citestePacient();
        System.out.println(listaP2.size());
        dp.stergeProgDb();


        //testam DB medicament
        DatabaseMedicament dm= DatabaseMedicament.getInstance();
        Medicament m1 = new Medicament("Xanax", 20, "Farm", 15, 1, 2021, 10, 1, 0.2f);
        Medicament m2 = new Medicament("Paracetamol", 10, "Farm", 20, 8, 2020, 20, 2, 0.1f);
        dm.adaugaMedicament(m1);
        dm.adaugaMedicament(m2);
        List <Medicament> listM = dm.citesteMedicament();
        System.out.println(listM.size());
        dm.updateMedicament("Xanax", 50);
        dm.afiseazaMedicament("Xanax");
        dm.stergeMedicament("Xanax");
        dm.afiseazaMedicament("Xanax");
        dm.stergeMedicamentDb();

    }
}
