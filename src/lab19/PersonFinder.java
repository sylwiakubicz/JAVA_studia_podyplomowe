package lab19;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.*;
import java.util.Scanner;

public class PersonFinder {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("skubicz");
        ds.setPassword("s_!KOT!_33");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);
        ds.setDatabaseName("AdventureWorks");
        ds.setTrustServerCertificate(true);

        String sql = "SELECT TOP 10 * FROM Person.Contact WHERE LastName LIKE (?)";

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj początek albo całe nazwisko: ");
        String lastName = scan.nextLine() + "%";
        if (lastName.equals("%")) {
            System.out.println("Podaj początek albo całe nazwisko: ");
            lastName = scan.nextLine() + "%";
        }

        try (Connection con = ds.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, lastName);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                do {
                    System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
                } while (rs.next());
            } else {
                System.out.println("Nie znaleziono osób.");
            }

        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
        // TODO: zamknąć rs
    }
}
