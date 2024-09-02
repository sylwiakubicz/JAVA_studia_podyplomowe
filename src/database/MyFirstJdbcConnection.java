package database;

import java.sql.*;

public class MyFirstJdbcConnection {
    //10 pierwszych imion i nazwisk osób z tabeli Contact bazy AdventureWorks
    // select top 10 * from Person.Contact
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true;trustServerCertificate=true;databaseName=AdventureWorks;user=skubicz;password=s_!KOT!_33;";
        String sql = "select top 10 * from Person.Contact";
        // automatycznie obiekty zostaną zwolnione (te podane w nawiasie)
        try (Connection con =  DriverManager.getConnection(connectionUrl);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
