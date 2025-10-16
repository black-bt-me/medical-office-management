/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cabinetmedc;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Cabinetmedc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       

        System.out.print("Enter Full Name: ");
        String fullname = scanner.nextLine();

        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Consultation: ");
        String consultation = scanner.nextLine();

        System.out.print("Enter RDV (Date): ");
        String rdv = scanner.nextLine();

        System.out.print("Enter Ordonnance: ");
        String ordonnance = scanner.nextLine();

        System.out.print("Enter Solde: ");
        String  solde = scanner.nextLine();

        methods.methodeadd( fullname, phone, consultation, rdv, ordonnance, solde);

        scanner.close(); // Close the scanner
    }
}
