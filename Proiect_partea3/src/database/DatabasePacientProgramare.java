package database;

import model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabasePacientProgramare {
    private static DatabasePacientProgramare instanta = null;
    static Connection connectionPacient = null;
    static Connection connectionProg=null;

    private DatabasePacientProgramare() throws SQLException, ClassNotFoundException {
        //Class.forName("com.mysql.jdbc.Driver");
        connectionPacient = DriverManager.getConnection("jdbc:sqlite:proiect.db");
        String sqlCreate = "CREATE TABLE IF NOT EXISTS pacientt ("
                + "id INTEGER , "
                + "nume VARCHAR(50), "
                + "prenume VARCHAR(20), "
                + "varsta INTEGER, "
                + "ziN INTEGER, "
                + "lunaN INTEGER, "
                + "anN INTEGER, "
                + "ziP INTEGER, "
                + "anP INTEGER, "
                + "lunaP INTEGER, "
                + "oraP INTEGER , "
                + "medic INTEGER)";
        try (Statement stmt = connectionPacient.createStatement()) {
            stmt.execute(sqlCreate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connectionProg = DriverManager.getConnection("jdbc:sqlite:proiect.db");
        String sqlCreate2 = "CREATE TABLE IF NOT EXISTS programare ("
                + "id INTEGER , "
                + "nume VARCHAR(50), "
                + "prenume VARCHAR(20), "
                + "ziP INTEGER, "
                + "anP INTEGER, "
                + "lunaP INTEGER, "
                + "oraP INTEGER , "
                + "medic INTEGER)";
        try (Statement stmt2 = connectionProg.createStatement()) {
            stmt2.execute(sqlCreate2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabasePacientProgramare getInstance() throws SQLException, ClassNotFoundException {
        if (instanta == null)
            instanta = new DatabasePacientProgramare();
        return instanta;
    }


    public void adaugaPacient(Pacient p, int medic) {
        String insertSql =
                "INSERT INTO pacientt " +
                        "(id, nume, prenume, varsta, ziN, lunaN, anN, ziP, anP, lunaP, oraP, medic) " +
                        "VALUES " +
                        "('" + p.getNrIdentificare() + "', '" + p.getNume() + "', '" + p.getPrenume() + "', '" + p.getVarsta() + "', '"
                        +  p.getZi_nastere() + "', '" + p.getLuna_nastere() + "', '" + p.getAn_nastere()+ "', '"
                        + p.getProgramare().getZiProg() + "', '" + p.getProgramare().getAnProg() + "', '" + p.getProgramare().getLunaProg()
                        + "', '" + p.getProgramare().getOraProg() +  "', '" + medic +"')";
        System.out.println(insertSql);
        try (Statement stmt = connectionPacient.createStatement()) {
            int insertedRows = stmt.executeUpdate(insertSql);
            String insertSql2 = "INSERT INTO programare " +
                    "(id, nume, prenume, ziP, anP, lunaP, oraP, medic) " +
                    "VALUES " +
                    "('" + p.getNrIdentificare() + "', '" + p.getNume() + "', '" + p.getPrenume() + "', '"
                    + p.getProgramare().getZiProg() + "', '" + p.getProgramare().getAnProg() + "', '" + p.getProgramare().getLunaProg()
                    + "', '" + p.getProgramare().getOraProg() +  "', '" + medic +"')";
            try (Statement stmt2= connectionProg.createStatement())
            {
                int insertedRow2 = stmt2.executeUpdate(insertSql2);
            } catch (SQLException k)
            {
                k.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Pacient> citestePacient() {
        String getSql = "SELECT id, nume, prenume, varsta, ziN, lunaN, anN, ziP, anP, lunaP, oraP, medic FROM pacientt";
        try (Statement stmt = connectionPacient.createStatement()) {
            List<Pacient> listaPacient = new ArrayList<>(5);
            ResultSet r = stmt.executeQuery(getSql);
            while (r.next()) {
                GestiuneMedici gestiune = new GestiuneMedici();
                Medic[] medici = gestiune.getMedici();
                Pacient p = new Pacient();
                p.setNrIdentificare(r.getInt("id"));
                p.setNume(r.getString("nume"));
                p.setPrenume(r.getString("prenume"));
                p.setVarsta(r.getInt("varsta"));
                p.setZi_nastere(r.getInt("ziN"));
                p.setLuna_nastere(r.getInt("lunaN"));
                p.setAn_nastere(r.getInt("anN"));
                Programare pp = new Programare(r.getInt("ziP"), r.getInt("lunaP"), r.getInt("anP"), r.getInt("oraP"), p, medici[r.getInt("medic")]);
                p.setProgramare(pp);
                listaPacient.add(p);
            }
            return listaPacient;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void citesteProgramare(){
        String getSql = "SELECT id, nume, prenume, ziP, anP, lunaP, oraP, medic FROM programare";
        try (Statement stmt = connectionProg.createStatement()) {
            ResultSet r = stmt.executeQuery(getSql);
            while (r.next()) {
                System.out.println(r.getInt("id")+ r.getString("nume")+ " " + r.getString("prenume")+ " "
                        + r.getInt("ziP") + " " + r.getInt("anP")+ " "  + r.getInt("lunaP")+ " "  + r.getInt("oraP")+ " "
                        + r.getInt("medic"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProgramare(int nrInreg, int ora, int zi, int luna) {
        System.out.println("Baza de date updated");
        String query = "update programare set oraP = ?,  ziP = ?, lunaP = ? where id = ?";
        try (Statement stmt = connectionProg.createStatement()){
            PreparedStatement pstmt = connectionProg.prepareStatement(query) ;

            // set the corresponding param
            pstmt.setInt(1, ora);
            pstmt.setInt(4, nrInreg);
            pstmt.setInt(2, zi);
            pstmt.setInt(3,luna);


            // update
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void updatePacient(String s, int ora) {
        String query = "update pacientt set oraP = ? where nume = ?";
        try (Statement stmt = connectionPacient.createStatement()){
            PreparedStatement pstmt = connectionPacient.prepareStatement(query) ;

            // set the corresponding param
            pstmt.setInt(1, ora);
            pstmt.setString(2, s);

            // update
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void afiseazaPacient(String s)
    {
        String getSql =
                "SELECT nume, oraP FROM pacientt " +
                        "WHERE nume = '" + s + "'";
        try (Statement stmt = connectionPacient.createStatement()) {
            ResultSet result = stmt.executeQuery(getSql);
            if (result.next()) {
                System.out.println(result.getString("nume") + result.getInt("oraP"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void stergePacient(String s) {
        String getSql =
                "DELETE FROM pacientt " +
                        "WHERE nume = '" + s + "'";
        System.out.println(getSql);
        try (Statement stmt = connectionPacient.createStatement()) {
            stmt.executeUpdate(getSql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String getSql2 =
                "DELETE FROM programare " +
                        "WHERE nume = '" + s + "'";
        System.out.println(getSql2);
        try (Statement stmt2 = connectionProg.createStatement()) {
            stmt2.executeUpdate(getSql2);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void stergePacientDb()
    {
        String getSql =
                "DELETE FROM pacientt " ;
        System.out.println(getSql);
        try (Statement stmt = connectionPacient.createStatement()) {
            stmt.executeUpdate(getSql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void stergeProgDb()
    {
        String getSql =
                "DELETE FROM programare " ;
        System.out.println(getSql);
        try (Statement stmt = connectionProg.createStatement()) {
            stmt.executeUpdate(getSql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
