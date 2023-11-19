package main;

import entities.Employe;
import entities.SocieteArrayList;


public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        SocieteArrayList societe = new SocieteArrayList();

        // Create some employees
        Employe employe1 = new Employe(1, "Zoghlami", "Dhirar", "IT", 2);
        Employe employe2 = new Employe(2, "Zoghlami2", "Dhirar2", "HR", 3);
        Employe employe3 = new Employe(3, "Zoghlami3", "Dhirar3", "Finance", 1);

        // Add employees to the company
        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);

        // Display all employees
        System.out.println("List of employees:");
        societe.displayEmploye();
        System.out.println();

        // Search for an employee by name
        String searchName = "Zoghlami2";
        boolean foundByName = societe.rechercherEmploye(searchName);
        System.out.println("Employee with name '" + searchName + "' found: " + foundByName);
        System.out.println();

        // Search for an employee by object
        boolean foundByObject = societe.rechercherEmploye(employe2);
        System.out.println("Employee found by object: " + foundByObject);
        System.out.println();

        // Remove an employee
        // societe.supprimerEmploye(employe1);

        // Display the updated list of employees
        // System.out.println("List of employees after removal:");
        societe.displayEmploye();
        System.out.println();

        // Sort employees by ID and display the sorted list
        societe.trierEmployeParId();
        System.out.println("List of employees after sorting by ID:");
        societe.displayEmploye();
        System.out.println();

        // Sort employees by name, department, and grade and display the sorted list
        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("List of employees after sorting by name, department, and grade:");
        societe.displayEmploye();




    }
}