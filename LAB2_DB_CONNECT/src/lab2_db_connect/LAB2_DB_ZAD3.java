/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Darek
 */
public class LAB2_DB_ZAD3 {
    public LAB2_DB_ZAD3(){
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
}
