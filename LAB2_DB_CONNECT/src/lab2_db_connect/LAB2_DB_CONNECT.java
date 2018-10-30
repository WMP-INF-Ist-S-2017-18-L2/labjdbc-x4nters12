package lab2_db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Darek
 */
public class LAB2_DB_CONNECT {
    public static void main(String[] args) {
        //postgresqlConnect();
        mysqlConnect();
        //sqliteConnect();
    }
    
    private static void postgresqlConnect(){
    System.out.println("-------- PostgreSQL " + "JDBC Connection Testing ------------");
	try {
            Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
            e.printStackTrace();
            return;
	}
            System.out.println("PostgreSQL JDBC Driver Registered!");
            Connection connection = null;
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BAZA_PRODUKTOW", "postgres", "zaq1@WSX");
            } catch (SQLException e) {
                System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
            }
                
            if (connection != null) System.out.println("You made it, take control your database now!");
            else System.out.println("Failed to make connection!");
    }
    
    private static void mysqlConnect(){
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

	try {
            Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BAZA_PRODUKTOW","banan", "banan");
	} catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
	}
        
	if (connection != null) System.out.println("You made it, take control your database now!");
	else System.out.println("Failed to make connection!");
    }
    
    private static void sqliteConnect(){
        Connection c = null;
      
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:BAZA_PRODUKTOW.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}