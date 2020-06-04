package database;
import model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DatabaseMedicament {
    private static DatabaseMedicament instance = null;
    static Connection connection = null;

    private DatabaseMedicament() throws SQLException, ClassNotFoundException {

        connection = DriverManager.getConnection("jdbc:sqlite:proiect.db");
        String sqlCreate = "CREATE TABLE IF NOT EXISTS medicament ("
                + "denumire VARCHAR(50), "
                + "distribuitor VARCHAR(20), "
                + "nrProduse INTEGER, "
                + "lunaExp INTEGER, "
                + "anExp INTEGER, "
                + "ziExp INTEGER, "
                + "nrProduseCutie INTEGER, "
                + "dozaRecom INTEGER, "
                + "concentratie FLOAT) ";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sqlCreate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseMedicament getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null)
            instance = new DatabaseMedicament();
        return instance;
    }

    public void adaugaMedicament(Medicament p) {
        String insertSql =
                "INSERT INTO medicament " +
                        "(denumire, distribuitor, nrProduse, lunaExp, anExp, ziExp, nrProduseCutie, dozaRecom, concentratie) " +
                        "VALUES " +
                        "('" + p.getDenumire() + "', '" + p.getDistribuitor() + "', '" + p.getNrProduse() + "', '" + p.getLunaExp() + "', '"
                        + p.getAnExp() + "', '" + p.getZiExp() + "', '" + p.getNrProduseCutie() + "', '" + p.getDozaRecomandataZi()
                        +  "', '" + p.getDozaj() + "')";
        try (Statement stmt = connection.createStatement()) {
            System.out.println("Adaug cu succes in baza de date!");
            int insertedRows = stmt.executeUpdate(insertSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Medicament> citesteMedicament() {
        String getSql = "SELECT denumire, distribuitor, nrProduse, lunaExp, anExp, ziExp, nrProduseCutie, dozaRecom, concentratie FROM medicament";
        try (Statement stmt = connection.createStatement()) {
            ArrayList<Medicament> lista = new ArrayList<>(5);
            ResultSet r = stmt.executeQuery(getSql);
            while (r.next()) {
                Medicament pp = new Medicament(r.getString("denumire"), r.getInt("nrProduse"),
                        r.getString("distribuitor"), r.getInt("ziExp"), r.getInt("lunaExp"), r.getInt("anExp")
                , r.getInt("nrProduseCutie"), r.getInt("dozaRecom"), r.getFloat("concentratie"));
                lista.add(pp);
            }
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateMedicament(String s, int n) {
        String query = "update medicament set nrProduse = ? where denumire = ?";
        try (Statement stmt = connection.createStatement()){
            PreparedStatement pstmt = connection.prepareStatement(query) ;

            // set the corresponding param
            pstmt.setInt(1, n);
            pstmt.setString(2, s);

            // update
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void afiseazaMedicament(String s)
    {
        String getSql =
                "SELECT denumire, distribuitor, nrProduse, lunaExp, anExp, ziExp, nrProduseCutie, dozaRecom, concentratie FROM medicament " +
                        "WHERE denumire = '" + s + "'";
        try (Statement stmt = connection.createStatement()) {
            ResultSet r = stmt.executeQuery(getSql);
            if (r.next()) {
                System.out.println(r.getString("denumire") + " " + r.getInt("nrProduse")+ " " +
                        r.getString("distribuitor")+ " " + r.getInt("ziExp")+ " " + r.getInt("lunaExp")+ " " + r.getInt("anExp")
                        + " " + r.getInt("nrProduseCutie")+ " " + r.getInt("dozaRecom")+ " " + r.getFloat("concentratie"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void stergeMedicament(String s) {
        String getSql =
                "DELETE FROM medicament " +
                        "WHERE denumire = '" + s + "'";
        System.out.println(getSql);
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(getSql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void stergeMedicamentDb() {
        String getSql =
                "DELETE FROM medicament " ;
        System.out.println(getSql);
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(getSql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}