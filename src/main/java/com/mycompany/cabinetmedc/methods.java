/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabinetmedc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class methods {

//mehode login
    public static boolean methodelogin(String username, String password) {
        String sqllogin= "SELECT * FROM login WHERE username = ? AND password = ?";
        try (Connection conn = Bconnexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqllogin)) {
            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); // Returns true if a matching record is found
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Authentication failed
    }

//    methode add
    public static boolean methodeadd( String fullname, String phone, String consultation, String rdv, String ordonnance, String solde) {
        String sqladd = "INSERT INTO patientADD( fullname, phone, consultation, rdv, ordonnance, solde) VALUES (?, ?, ?, ?, ?, ?)";

       try (Connection conn = Bconnexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqladd)) {
            //stmt.setInt(1, id);
            stmt.setString(1, fullname);
            stmt.setString(2, phone);
            stmt.setString(3, consultation);
            stmt.setString(4, rdv);
            stmt.setString(5, ordonnance);
            stmt.setString(6, solde);

            int rowsAffected = stmt.executeUpdate();
            System.out.println("Record added successfully! Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       return false; // Authentication failed

    }}
