package nl.hu.oop.demos.db;

import java.sql.*;

public class DbMain {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/autos?user=postgres&password=1q2w3e!";

        Connection conn = DriverManager.getConnection(url);
        try {
            Statement s = conn.createStatement();
            try {
                ResultSet results = s.executeQuery("select * from autos");

                while (results.next()) {
                    int id = results.getInt("id");
                    String merk = results.getString("merk");
                    String type = results.getString("type");
                    int bouwjaar = results.getInt("bouwjaar");
                    Auto auto = new Auto(id, merk, type, bouwjaar);

                    System.out.println(auto);
                }
            } finally {
                s.close();
            }

            PreparedStatement ps = conn.prepareStatement("insert into autos(merk,type,bouwjaar) values (?,?,?)");
            try {
                ps.setString(1, "Batmobile");
                ps.setString(2, "Feestelijke editie");
                ps.setInt(3, 1999);

                ps.executeUpdate();
            } finally {
                ps.close();
            }
        } finally {
            conn.close();
        }
    }
}
