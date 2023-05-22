package managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class QueriesManager {

    public static void main(String args[]) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "host", "123456789");
            Statement stmt = con.createStatement();
            System.out.println("ENTRO");
            ResultSet rs = stmt.executeQuery("show databases");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public QueriesManager() {

        this.getQuery();
    }

    public ArrayList<String> getQuery() {
        ArrayList<String> databases = new ArrayList();
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "host", "123456789");
            Statement stmt = con.createStatement();
            System.out.println("ENTRO");
            ResultSet rs = stmt.executeQuery("show databases");
            
            while (rs.next()) {
                System.out.println(rs.getString(1));
                databases.add(rs.getString(1));
            }
            
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return databases;
        

    }
}
