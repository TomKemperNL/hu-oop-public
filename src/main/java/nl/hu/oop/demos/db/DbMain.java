package nl.hu.oop.demos.db;

import java.sql.*;

public class DbMain {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/autos?user=postgres&password=1q2w3e!";
        Connection conn = DriverManager.getConnection(url);

        Statement s = conn.createStatement();
        ResultSet results = s.executeQuery("select * from autos");

        while(results.next()){
            int id = results.getInt("id");
            String merk = results.getString("merk");
            String type = results.getString("type");
            int bouwjaar = results.getInt("bouwjaar");
            Auto auto = new Auto(id, merk, type, bouwjaar);

            System.out.println(auto);
        }
    }
}
