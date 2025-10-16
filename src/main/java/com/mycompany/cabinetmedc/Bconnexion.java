package com.mycompany.cabinetmedc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bconnexion {

    private static Connection connection;

    public static Connection getConnection() {

        if (connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbcm", "postgres", "postgres");

                // Register MySQL driver
                //  Class.forName("com.mysql.cj.jdbc.Driver");
                // Connect to MySQL database
                // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jrdb", "root", "password");  // Update with your MySQL credentials
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Bconnexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Bconnexion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return connection;
    }

}
