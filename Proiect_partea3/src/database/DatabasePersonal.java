package database;

import model.Personal;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabasePersonal {
    private static DatabasePersonal instance = null;
    static Connection connection = null;


    private DatabasePersonal() throws SQLException, ClassNotFoundException {
        //Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:sqlite:proiect.db");
        String sqlCreate = "CREATE TABLE IF NOT EXISTS personal ("
                + "id INTEGER , "
                + "nume VARCHAR(50), "
                + "prenume VARCHAR(20), "
                + "an INTEGER)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sqlCreate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabasePersonal getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null)
            instance = new DatabasePersonal();
        return instance;
    }

    public void adaugaPersonal(Personal p, int index) {
        String insertSql =
                "INSERT INTO personal " +
                        "(id, nume, prenume, an) " +
                        "VALUES " +
                        "('" + index + "', '" + p.getNume() + "', '" + p.getPrenume() + "', '" + p.getAnangajare()  + "')";
        try (Statement stmt = connection.createStatement()) {
            int insertedRows = stmt.executeUpdate(insertSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Personal> citestePersonal() {
        String getSql = "SELECT nume, prenume, an, id FROM personal";
        try (Statement stmt = connection.createStatement()) {
            ArrayList<Personal> listaPersonal = new ArrayList<>(5);
            ResultSet r = stmt.executeQuery(getSql);
            while (r.next()) {
                Personal pp = new Personal(r.getString("nume"), r.getString("prenume"), r.getInt("an"));
                listaPersonal.add(pp);
            }
            return listaPersonal;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void updatePersonal(String s, int an) {
        String query = "update personal set an = ? where nume = ?";
        try (Statement stmt = connection.createStatement()){
             PreparedStatement pstmt = connection.prepareStatement(query) ;

            // set the corresponding param
            pstmt.setInt(1, an);
            pstmt.setString(2, s);

            // update
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void afiseazaPersonal(String s)
    {
        String getSql =
                "SELECT nume, prenume, an FROM personal " +
                        "WHERE nume = '" + s + "'";
        try (Statement stmt = connection.createStatement()) {
            ResultSet result = stmt.executeQuery(getSql);
            if (result.next()) {
                System.out.println(result.getString("nume") + " " + result.getString("prenume") + " " + result.getInt("an"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




    public void stergePersonal(String s) {
        String getSql =
                "DELETE FROM personal " +
                        "WHERE nume = '" + s + "'";
        System.out.println(getSql);
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(getSql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void stergePersonalDb() {
        String getSql =
                "DELETE FROM personal " ;
        System.out.println(getSql);
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(getSql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}